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

public class TestNgAnnotations {

	  @Test(priority=6)
	  public void testcase1() {
		  System.out.println("inside testcase1");
	  }
	  
	  @Test(priority = -7)
	  public void testcase2() {
		  System.out.println("inside testcase2");
	  }
	  
	  @Test(priority=-3,invocationCount=4)
	  public void testcase3() {
		  System.out.println("inside testcase3");
	  }
	  
	  @Test
	  public void Testcase4() {
		  System.out.println("inside testcase4");
	  }
	  
	  @Test()
	  public void BestcAse5() {
		  System.out.println("inside Bestcase5");
	  }
	  
	  @Test()
	  public void testCase6() {
		  System.out.println("inside Testcase6");
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
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("inside afterSuite");
	  }

}
