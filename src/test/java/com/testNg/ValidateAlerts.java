package com.testNg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ValidateAlerts {
	WebDriver driver;
	  
	  @Test(priority=6)
	  public void ValidateAlertPageLoadedSuccessfully() {
		  System.out.println("inside ValidateAlertPageLoadedSuccessfully");
		  String TitleOfAlertsPage = driver.getTitle();
		  System.out.println("TitleOfAlertsPage:"+TitleOfAlertsPage);
		  Assert.assertEquals(TitleOfAlertsPage, "ToolsQ");
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("inside beforeMethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("inside afterMethod");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("inside beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("inside afterClass");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("inside beforeTest");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("inside afterTest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("inside beforesuite");
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/alerts");
		   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		   /*
		   implicit wait : Global waiting mechanism applicable for all web elements 
		   until specified time duration.
		   */
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("inside afterSuite");
	  }

}
