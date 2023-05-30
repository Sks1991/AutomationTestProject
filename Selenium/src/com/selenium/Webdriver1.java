package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();//maximize screen of window
		driver.manage().deleteAllCookies();//delete all cookies
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();//by using going back page
		driver.navigate().forward();//by using going forward page
		driver.navigate().back();
		driver.navigate().refresh();//by using refresh page
		driver.close();//after excuting close current window
        driver.quit();//close all window
	}

}
