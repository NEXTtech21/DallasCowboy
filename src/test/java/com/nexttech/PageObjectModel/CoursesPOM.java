package com.nexttech.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPOM {
 
	WebDriver driver;
	 public CoursesPOM(WebDriver driver) {
		 this.driver=driver;
		 
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"headermenudesktop\"]/ul/li/a")
	 WebElement Hover_Content;
	 public WebElement Content() {
		return Hover_Content;
	 }
	
	@FindBy (xpath="//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")
	WebElement Click_Courses;
	public WebElement Courses() {
		return Click_Courses;  
		
	}
	
		
	 }

