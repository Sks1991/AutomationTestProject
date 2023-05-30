package com.selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//implicit wait waits for load page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);//Normal wait
		
		//to get html tag of web element
		String tagname=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getTagName();
        System.out.println("Tag name of facebook logo="+tagname);
        
        //get location of a web element
       Point location=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getLocation();
        System.out.println("Location:-"+location);
        
        //get css value(font-size,weight,colour)
        String fontsize=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getCssValue("font-size");
	    System.out.println("Font-Size of Logo:-"+fontsize);
	    
	    String fontweight=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getCssValue("font-weight");
	    System.out.println("Font-weight of Logo:-"+fontweight);
	    
	    String fontcolor=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getCssValue("color");
	    System.out.println("Font-color of Logo:-"+fontcolor);
	    
	    
	    String attribute=driver.findElement(By.name("email")).getAttribute("placeholder");
	    System.out.println("Attribute_value="+attribute);
	    
	    //Explicit wait
	   // WebDriverWait wait=new WebDriverWait(driver, 20);
	    //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
	    driver.findElement(By.name("email")).sendKeys("Sudhir");
	    
	    
	}

}
