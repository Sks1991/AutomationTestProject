package com.testNGprogram;

import org.testng.annotations.Test;

public class Group2 {
		@Test(groups = "Regression")
		public void Groupmethod1() {
			System.out.println("Group method1 in TestNG1");
		}
		@Test(groups = "Smoke")
		public void Groupmethod2() {
			System.out.println("Group method2 in TestNG2");
		}
		@Test(groups = "Regression")
		public void Groupmethod3() {
			System.out.println("Group method3 in TestNG3");
		}
    }
