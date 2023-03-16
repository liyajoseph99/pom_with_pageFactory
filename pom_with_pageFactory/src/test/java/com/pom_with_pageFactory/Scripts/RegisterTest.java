package com.pom_with_pageFactory.Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom_with_pageFactory.Pages.RegisterPage;

import utilities.Base;


public class RegisterTest extends Base {    //extends LoginTest-to get the - after login - driver details
	
  @Test
  public void registerPageDetails() throws InterruptedException {
	 
	  RegisterPage rpobj=new RegisterPage(driver);
	  rpobj.registerDetails();
  }
}
