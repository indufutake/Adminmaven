package com.hsbcnet.testcases;

import org.testng.annotations.Test;

import com.hsbcnet.base.BaseTest;
import com.hsbcnet.pages.DashBoardPage;


public class DashBoardTest extends BaseTest {
  
	@Test
  public void verifyLogin() {
		String logoutLab=DashBoardPage.getLogoutLable();
		System.out.println("Lable==="+logoutLab);
		log.debug("$$$$Logout Lable$$$$$"+logoutLab);
		
  }
}
