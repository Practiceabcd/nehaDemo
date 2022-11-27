package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {      //testNG
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		String browser = "chrome";       //firefox edge ghu shakto
		
		if(browser.equalsIgnoreCase("chrome")) //chrome mhnun chrome ne open honar
		{
			WebDriverManager.chromedriver().setup();//due to this no need to write setProperty line
			driver = new ChromeDriver();           //and for this we have to add webdriver manager dependency
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide browser names from chrome, firefox or edge");
		}
		driver.get("https://app.deriv.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
