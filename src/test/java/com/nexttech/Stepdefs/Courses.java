package com.nexttech.Stepdefs;

import org.openqa.selenium.WebDriver;

import Utility.BrowserFactory1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Courses {
	
	WebDriver driver;
	

@Given("^user go to the MrBool$")
public void user_go_to_the_MrBool() throws Throwable {
    
	BrowserFactory1 br= new BrowserFactory1(driver);
	br.BrowserFactory("webdriver.chrome.driver","C:\\Users\\Mamun\\Downloads\\chromedriver_win32\\chromedriver.exe");
}

@Given("^user hover mouse on content$")
public void user_hover_mouse_on_content() throws Throwable {
    
}

@When("^user click on courses$")
public void user_click_on_courses() throws Throwable {
    
}

@Then("^user should be able to redirect to courses page$")
public void user_should_be_able_to_redirect_to_courses_page() throws Throwable {
   
}



}
