package com.nexttech.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.PageObjectModel.BankOfAmerPOM;

import Utility.BrowserFactory1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankOfAmerica {
	
	WebDriver driver;
	
	@Given("^user wants to navigate Bank Of america homepage$")
	public void user_navigate_Bank_Of_america_homepage() throws Throwable {
	   
	BrowserFactory1 BR= new BrowserFactory1(driver);
	BR.BrowserFactory("webdriver.chrome.driver", "C:\\Users\\Mamun\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		
		driver.manage().window().maximize();
		driver.get("https://www.bankofamerica.com/");
	}

	@When("^user click on homeloans button$")
	public void user_click_on_homeloans_button() throws Throwable {
		try {
		BankOfAmerPOM pom= new BankOfAmerPOM(driver);
		pom.HomeLoans().click();
		}
		catch( Exception e) {
			System.out.println("test failed");
			
		}
		
	   
	}

	@When("^user click on mortgage$")
	public void user_click_on_mortgage() throws Throwable {
		try {
		BankOfAmerPOM pom =new BankOfAmerPOM(driver);
		pom.mortgage().click();
		}
		catch(Exception e) {
			System.out.println(" not found");
		}
	}

	@Then("^user should be able to see the mortgage rate$")
	public void user_should_be_able_to_see_the_mortgage_rate() throws Throwable {
		try {
		BankOfAmerPOM pom =new BankOfAmerPOM(driver);
		pom.page();
		}
		catch(Exception e) {
			System.out.println("not working");
		}
	}



}
