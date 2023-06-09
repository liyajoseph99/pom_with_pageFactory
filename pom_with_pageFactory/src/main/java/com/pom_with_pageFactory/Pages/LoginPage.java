package com.pom_with_pageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='userName']")  //instance variable, driver.FindElement
	WebElement user;
	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	@FindBy(xpath="//input[@name='submit']")
	WebElement submit;
	
	public LoginPage(WebDriver driver) {  //constructor, passing the parameter driver,calling from  LoginTest
		this.driver=driver;
		PageFactory.initElements(driver, this); //to pass the driver value to pagefactory(ie, @FindBy)
	}
	
	public void loginDetailsTest1() throws InterruptedException {
		user.sendKeys("tutorial");
		Thread.sleep(2000);
		pass.sendKeys("tutorial");
		Thread.sleep(3000);
		submit.click();
	}
}
