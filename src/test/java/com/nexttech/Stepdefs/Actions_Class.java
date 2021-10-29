package com.nexttech.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Class {
   WebDriver driver;
   @Test
	public void dropdown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mamun\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://mrbool.com/");
		
	Actions ACT= new Actions(driver);
	ACT.moveToElement(driver.findElement(By.xpath("//a[@class=\"menulink\"]"))).build().perform();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();	
	Thread.sleep(4000);
	
	driver.close();
   
   }
}
