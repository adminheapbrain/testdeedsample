# testdeedsample
Requirement : JDK 1.8

Install scala 2.12.3 / and Scala nature IDE

add dependancy https://mvnrepository.com/artifact/com.heapbrain/testdeed

com.heapbrain testdeed 1.3.8
Clear your warnings from pom.xml (ex. managed version higher) Maven update and "run clean package"

add testdeed.properties in src/resource folder with configuration of qahost, qphost, prhost URL add /webapp/performance folder under /src/main - This will help to access your report from server.

In springboot application class a. @TestDeedApplication(name="Your application name") b. @ComponentScan(basePackages= {"com.heapbrain.core.testdeed","your_package"}) c. In main method - TestDeedApp.load(YourSpringBootApplication.class);

In controller a. In service - @TestDeedApi(name="Your Service name", isProdEnabled=false) - Name should be unique b. In method (Optional)- @TestDeedApiOperation(name="testGet", description="Return employee Name")

Start your server.. For performance url : http://your_server_url/testdeed.html

Happy stress loading :)