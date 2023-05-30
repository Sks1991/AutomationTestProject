package com.selenium;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class WindowHandling {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        Thread.sleep(3000);
        
        WebElement wb=driver.findElement(By.xpath("//div[text()='Companies']"));
        Actions act=new Actions(driver);
        act.moveToElement(wb).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Product based")).click();
       
        
		Set<String> set=driver.getWindowHandles();
        Iterator<String> itr=set.iterator();
		String parentid=itr.next();
        String childid=itr.next();
        driver.switchTo().window(childid);
        driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]/preceding-sibling::i")).click();
        driver.close();
        driver.switchTo().window(parentid);

        
        Actions act1=new Actions(driver);
        act1.moveToElement(driver.findElement(By.xpath("//div[text()='Services']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Jobs4u")).click();
	}

}
