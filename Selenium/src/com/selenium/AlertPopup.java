package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(3000);
        
        //pass control to alert and capture the text present in alert.
        Alert alt=driver.switchTo().alert();
        String alerttext=alt.getText();
        System.out.println(alerttext);
        alt.accept();//click on ok button
        //alt.dismiss();//click on x button
        
        driver.findElement(By.id("promptBox")).click();
        Alert alt1=driver.switchTo().alert();
        alt1.sendKeys("sudhajipur@gmail.com");
        alt1.dismiss();

	}

}
