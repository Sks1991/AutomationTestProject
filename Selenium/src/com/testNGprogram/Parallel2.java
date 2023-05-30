package com.testNGprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void ParallelTest2() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();//by using going back page
		driver.navigate().forward();//by using going forward page
		driver.navigate().back();
		
	}

}

