package com.github.testdeed.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.heapbrain.core.testdeed.annotations.TestDeedApplication;
import com.heapbrain.core.testdeed.config.TestDeedApp;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@TestDeedApplication(name="Test testdeed configure application")
@ComponentScan(basePackages= {"com.heapbrain.core.testdeed","com.github.testdeed.sample"})
public class Application {

	public static void main(String[] args) {
		TestDeedApp.load(Application.class);
		SpringApplication.run(Application.class, args);
	}

}