package com.pom_with_pageFactory.Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom_with_pageFactory.Pages.RegisterPage;


public class RegisterTest extends LoginTest {    //extends LoginTest-to get the - after login - driver details
	
  @Test
  public void registerPageDetails() throws InterruptedException {
	 
	  RegisterPage rpobj=new RegisterPage(driver);
	  rpobj.registerDetails();
  }
}
