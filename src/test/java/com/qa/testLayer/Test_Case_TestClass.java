package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;
import com.qa.testData.Test_Case;

public class Test_Case_TestClass extends TestBase{

	
		
		@Test
		public void TestCase1() throws InterruptedException
		{
		LoginPage log = new LoginPage();
		log.clickOnLoginButton1();
		log.enterEmail("amarwaghmare573@gmail.com");
		log.enterPassword("Test@1234");
		log.clickOnLoginButton2();
		
		
		//====================================
		
		Test_Case test = new Test_Case();
		test.EnterValue("2");
		Thread.sleep(5000);
		//test.ClickonRise_Percentage();
		//Thread.sleep(8000);
		
		test.ClickOnRise();
		Thread.sleep(8000);
		
		test.ClickonReport();
		Thread.sleep(8000);
		
		test.ClickonProftTable();
		Thread.sleep(8000);
		test.ClickonRef_Id();
		
		}

	


}