package com.hsbcnet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hsbcnet.base.BaseTest;


public class LoginPage extends BaseTest  {
	private static By emailTextBox=By.xpath("//*[@id='email']");
	private static By passwordTextBox=By.xpath("//*[@id='password']");
	
	
	private static By signInBtn=By.xpath("//button[contains(.,'Sign In')]");
	
	
	
	public LoginPage(WebDriver driver1) {
		LoginPage.driver=driver1;
	//	PageFactory.initElements(driver, this);
	}

//Element finding.....
	
	//Finding the email text Box
	public static  WebElement getEmailTextBox(){
		
		return driver.findElement(emailTextBox);
	}
	
	//Finding the password text Box
	public static  WebElement getPasswrodTextBox(){
		return driver.findElement(passwordTextBox);
	}

	//Finding the SignIn Button
	public static WebElement getSignInBtn(){
		return driver.findElement(signInBtn);
	}

//Actions..........
	//Entering email ID
	public static void enterEmailText(String emailVal){
		log.info("....Entering the Email ID");
		getEmailTextBox().sendKeys(emailVal);
	}
	
	//Enter password
	public static void enterPasswordText(String passwordVal){
		log.info("....Entering the Password");
		log.debug("password==="+passwordVal);
		getPasswrodTextBox().sendKeys(passwordVal);
		//pwd.sendKeys(passwordVal);
	}
	

	public static DashBoardPage clickOnSignIn(){
		getSignInBtn().click();  //--- For By 
		//loginBtn.click(); //---For PageFactory
		return new DashBoardPage(driver);
	}
	
}
