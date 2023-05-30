package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//upcasting
		driver.get("https://online.actitime.com/abcdef");//nevigate to url
		driver.findElement(By.id("username")).sendKeys("sudhir4ever13@gmail.com");//enter username
        driver.findElement(By.name("pwd")).sendKeys("dZ23Aete");//enter password
        driver.findElement(By.id("loginButton")).click();//enter click button
        driver.findElement(By.id("keepLoggedInCheckBox")).click();
        Thread.sleep(6000);
        String titlepage=driver.getTitle();
        System.out.println("The title of actitime is "+titlepage);
        
        String currenturl=driver.getCurrentUrl();
        System.out.println("The currenturl of actitime is "+currenturl);
        
        String sourcecode=driver.getPageSource();
        System.out.println("The sourcecode of actitime is "+sourcecode);
	}

}
