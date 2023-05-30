package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://online.actitime.com/abcdef");
		
        WebElement wb=driver.findElement(By.id("keepLoggedInCheckBox"));
        wb.click();
        boolean issel=wb.isSelected();
        System.out.println("clicked checkbox is successfully=="+issel);
        Thread.sleep(4000);
        wb.click();
        boolean issel1=wb.isSelected();
        System.out.println("clicked checkbox is successfully=="+issel1);
        
        boolean enable=driver.findElement(By.id("loginButton")).isEnabled();
        System.out.println("Button is enabled=="+enable);
	}

}
