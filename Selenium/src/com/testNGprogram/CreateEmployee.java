package com.testNGprogram;

import org.testng.annotations.Test;

public class CreateEmployee {
@Test
public void VCreateemployeedata() {
	System.out.println("Enter Employee Data");
}
@Test(dependsOnMethods = "VCreateemployeedata")
public void Updateemployeedata() {
	System.out.println("Update Employee Data");
}
}
