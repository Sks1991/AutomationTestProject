package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-134069588%3A1684313972422037&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Af_xneGjIQyCrxq-5rA9-cwntW55-Hc_b4Rk3j_59fjMC2a6WUZ19mPkdaXKCpg1AYpU76X85wvDYw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    WebElement wb=driver.findElement(By.name("identifier"));
	          wb.sendKeys("sudhirk58@gmail.com");
	          Thread.sleep(4000);
	          wb.clear();
	          //driver.findElement(By.xpath("//span[text()='Next']")).click();
	          driver.close();
	
	
	
	
	
	
	
	
	
	
	}

}
