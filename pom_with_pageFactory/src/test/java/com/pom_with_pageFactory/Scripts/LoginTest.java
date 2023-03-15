package com.pom_with_pageFactory.Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom_with_pageFactory.Pages.LoginPage;
import utilities.Base;

public class LoginTest extends Base {
	
  @Test
  public void login() throws InterruptedException {
	  LoginPage lpobj1=new LoginPage(driver);  //passing the parameter driver to the constructor LoginPage
	  lpobj1.loginDetailsTest1();
  }
}
