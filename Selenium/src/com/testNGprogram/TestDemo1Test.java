package com.testNGprogram;

import org.testng.annotations.Test;

public class TestDemo1Test {
	@Test(enabled = false)
	public void DemoTest() {
		System.out.println("Demo Test");
	}
	@Test()
	public void DemoTest1() {
		System.out.println("Demo Test1");
	}
	@Test()
	public void DemoTest2() {
		System.out.println("Demo Test2");
	}
	@Test()
	public void DemoTest3() {
		System.out.println("Demo Test3");
	}
	@Test(enabled = false)
	public void DemoTest4() {
		System.out.println("Demo Test4");
	}
}
