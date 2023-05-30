package com.testNGprogram;

import org.testng.annotations.Test;

public class PriorityTestCases {
	@Test(priority = 3)
	public void Groupmethod1() {
		System.out.println("Group Method1 in TestNG");
	}
	@Test(priority = 1)
	public void Groupmethod2() {
		System.out.println("Group Method2 in TestNG");
	}
	@Test(priority = 2)
	public void Groupmethod3() {
		System.out.println("Group Method3 in TestNG");
	}
}
