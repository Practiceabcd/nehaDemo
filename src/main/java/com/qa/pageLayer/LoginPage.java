package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {         //POM

	public LoginPage()       //initialization
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------ Object Repo -----------------------------
	
	@FindBy(xpath="//button[@id='dt_login_button']")
	private WebElement btn_login1;  
	
	@FindBy(xpath="//input[@id='txtEmail']")
	private WebElement txt_email;  
	
	@FindBy(xpath="//input[@id='txtPass']")
	private WebElement txt_password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement btn_login2;  
	
	
	//--------------Action methods --------------------------Usage
	
	public void clickOnLoginButton1()
	{
		btn_login1.click();
	}
	
	public void enterEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		txt_password.sendKeys(pass);
	}
	
	public void clickOnLoginButton2()
	{
		btn_login2.click();
	}
}
