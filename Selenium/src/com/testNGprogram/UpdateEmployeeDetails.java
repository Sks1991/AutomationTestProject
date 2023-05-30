package com.testNGprogram;

import org.testng.annotations.Test;

public class UpdateEmployeeDetails {
	@Test(dependsOnMethods = "Createemployeedata",groups = "Smoke")
	public void Updateemployeedata() {
		System.out.println("Update Employee Data");
	}
}
