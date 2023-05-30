package com.testNGprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void ParallelTest1() {
	String Expectedtext="Facebook helps you connect and share with the people in your life.";
	
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
   String Actualtext=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
   if(Expectedtext.equals(Actualtext)) 
	{
		System.out.println("Text is matching==Pass");
	}else {
		System.out.println("Text is not matching==Fail");
	}
}
}
