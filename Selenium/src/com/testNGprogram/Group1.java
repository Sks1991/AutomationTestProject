package com.testNGprogram;

import org.testng.annotations.Test;

public class Group1 {
@Test(groups = "Smoke")
public void Groupmethod1() {
	System.out.println("Group method1 in TestNG");
}
@Test(groups = "Regression")
public void Groupmethod2() {
	System.out.println("Group method2 in TestNG");
}
@Test(groups = "Smoke")
public void Groupmethod3() {
	System.out.println("Group method3 in TestNG");
}
}
