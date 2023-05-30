package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      
        Actions act=new Actions(driver);
        act.contextClick(driver.findElement(By.xpath("//span[text()='Cart']"))).build().perform();
       act.sendKeys(Keys.CONTROL,"t").build().perform(); 
	}

}
