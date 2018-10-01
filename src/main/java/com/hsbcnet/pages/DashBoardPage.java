package com.hsbcnet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hsbcnet.base.BaseTest;

public class DashBoardPage extends BaseTest {

	@FindBy(xpath="//a[contains(.,'LOGOUT')]")
	static WebElement logoutLable;
	
	public DashBoardPage(WebDriver driver1){
		DashBoardPage.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public static String getLogoutLable(){
		return logoutLable.getText();
	}
	
}
