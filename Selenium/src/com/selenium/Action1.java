package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
        WebElement wb=driver.findElement(By.xpath("//div[text()='Electronics']"));
        Actions act=new Actions(driver);
        act.moveToElement(wb).build().perform();
        
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("Gaming")).click();
	}

}
