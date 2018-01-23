package com.github.testdeed.sample.controller;

import com.heapbrain.core.testdeed.annotations.TestDeedApi;
import com.heapbrain.core.testdeed.annotations.TestDeedApiOperation;
import com.github.testdeed.sample.to.TestTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/testdeed")
@TestDeedApi(name = "Sample Testdeed Service",isProdEnabled = false)
public class SampleController {
	
	@RequestMapping(value = "/getmethod", method = RequestMethod.GET)
	@TestDeedApiOperation(name="testget", description="test service to without any parameters")//Optional
	public String testService1() {
		System.out.println();
		return "From get method";
	}

	@RequestMapping(value = "/{version}/getmethod/getobject/{name}", method = RequestMethod.GET)
	@TestDeedApiOperation(name="testget", description="test service for get with param")//Optional
	public String testService2(@RequestParam String testparam, @PathVariable(value = "version") String version,
							   @PathVariable(value = "name") String name) {
		System.out.println(name);
		return "From Get Method"+testparam;
	}

	@RequestMapping(value = "/postmethod/postobject", method = RequestMethod.POST, consumes="multipart/form-data")
	@TestDeedApiOperation(name="testPost", description="test service for post multipart")//Optional
	public String testService3(@RequestParam("file") MultipartFile file) {
		System.out.println();
		return "From Get Multipart Method";
	}

	@RequestMapping(value = "/postmethod/postobject", method = RequestMethod.POST, consumes={"application/json","application/xml"})
	@TestDeedApiOperation(name="testPost", description="test service for post json/xml")//Optional
	public String testService4(@RequestBody TestTO testTO) {
		System.out.println();
		return "From Get Multipart Method";
	}

	@RequestMapping(value = "/{version}/postmethod/postxmlobject", method = RequestMethod.POST, consumes="application/xml")
	@TestDeedApiOperation(name="testPost", description="test service for post xml")//Optional
	public String testService5(@PathVariable String version, @RequestParam String testparam,
							   @RequestBody TestTO testto) {
		System.out.println();
		return "From Get Multipart Method";
	}

	@RequestMapping(value = "/{version}/putmethod/putobject", method = RequestMethod.PUT, consumes="application/json")
	@TestDeedApiOperation(name="testPost", description="test servicd for put json")//Optional
	public String testService6(@PathVariable String version, @RequestParam String testparam,
							   @RequestBody TestTO testto) {
		System.out.println();
		return "From Post Method";
	}
}
