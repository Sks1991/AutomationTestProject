package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement2 {

	public static void main(String[] args) {
		String value="Facebook helps you connect and share with the people in your life.";
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		 boolean dis=driver.findElement(By.xpath("//h2[@class='_8eso']")).isDisplayed();
		 System.out.println("Facebook --Logo is displayed successfully=="+dis+".");
		String text1=driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		  if(value.equals(text1)) {
			  System.out.println("Text is matched successfully pass");
		  }else {
			  System.out.println("Text is not matched");
			  
		  }
		
		}

}
