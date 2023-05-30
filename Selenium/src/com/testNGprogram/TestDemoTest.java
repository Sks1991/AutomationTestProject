package com.testNGprogram;

import org.testng.annotations.Test;

public class TestDemoTest {
@Test(invocationCount = 10)
public void DemoTest() {
	System.out.println("Demo Test");
}
}
