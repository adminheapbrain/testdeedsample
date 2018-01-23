package com.github.testdeed.sample.to;

import java.util.List;

public class TestTO {
	String name;
	String empId;
	List<TestTOSub> testTOSub;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public List<TestTOSub> getTestTOSub() {
		return testTOSub;
	}
	public void setTestTOSub(List<TestTOSub> testTOSub) {
		this.testTOSub = testTOSub;
	}
}
