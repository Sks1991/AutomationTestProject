package com.testNGprogram;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void ParallelTest3()  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
   
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      
        Actions act=new Actions(driver);
        act.contextClick(driver.findElement(By.xpath("//span[text()='Cart']"))).build().perform();
       act.sendKeys(Keys.CONTROL,"t").build().perform(); 
	}
}
