package com.hsbcnet.testcases;

import org.testng.annotations.Test;

import com.hsbcnet.base.BaseTest;
import com.hsbcnet.pages.LoginPage;


public class LoginTest extends BaseTest {
	
	@Test
	  public void Login() {
		log.info("******Inside the Login Test******");
		LoginPage.enterEmailText(config.getProperty("username"));
		LoginPage.enterPasswordText(config.getProperty("password"));
	LoginPage.clickOnSignIn();  
		
	  }
	
}
