package com.nexttech.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmerPOM {
	 
	WebDriver driver;
	
		
	public  BankOfAmerPOM(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}

	
	//click on homeloans
	@FindBy(xpath="//a[@id=\"navChecking\"]")
	WebElement Click_HomeLoans;
	public WebElement HomeLoans() {
		return Click_HomeLoans;
		
	}
	
	@FindBy(xpath="//a[@id=\"mortgages\"]")
	WebElement Click_mortgage;
	public WebElement mortgage() {
		return Click_mortgage;
		
	}
	
	@FindBy(xpath="//section[@id=\"EngagementHomeLoans\"]")
	WebElement See_page;
	public WebElement page() {
		return See_page;
		
	}
	
	
	
	
	
}
