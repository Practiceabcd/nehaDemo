package com.qa.testData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Test_Case extends TestBase {

	//public static WebDriver driver;
	
		public  Test_Case()       //initialization
		{
			PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//input[@id='dt_amount_input']")
	private WebElement Add_Count;
	
	//@FindBy(xpath="(//div[@class='btn-purchase__info btn-purchase__info--right'])[1]")
	//private WebElement Rise_Percentage;
	
	@FindBy(xpath="(//div[@class='btn-purchase__info btn-purchase__info--left'])[1]")
	private WebElement Rise;
	
	
	@FindBy(xpath="//a[@id='dt_positions_drawer_report_button']")
	private WebElement Report;
	
	@FindBy(xpath="//a[@id='dc_profit-table_link']")
	private WebElement Profit_Table;;
	
	@FindBy(xpath="(//div[@class='table__cell transaction_id'])[2]")
	private WebElement Ref_ID;
	
	
	
	public void EnterValue(String value)
	{
		Integer.valueOf(2);
		String a=value;
		Add_Count.clear();
		Add_Count.click();
		Add_Count.sendKeys(a);
	}
   /*  public void ClickonRise_Percentage()
	{
		Rise_Percentage.click();
	
	}*/
     
     public void ClickOnRise()
     {
    	Rise.click();
     }
     
     public void ClickonReport()
     {
    	 Report.click();
     }
     
     public void ClickonProftTable()
     {
    	 Profit_Table.click();
     }
     
     public void ClickonRef_Id()
     {
    	 Ref_ID.click();
     }
}


