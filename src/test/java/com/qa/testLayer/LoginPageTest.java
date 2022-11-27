package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLoginFunctionality()
	{
		LoginPage login = new LoginPage();
		login.clickOnLoginButton1();
		login.enterEmail("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton2();
		
	}

}
