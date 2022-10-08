package com.JavaBsics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingAlerts {
	static WebDriver driver;
	static Alert objAlert;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside beforesuite");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		/*
		 * implicit wait : Global waiting mechanism applicable for all web elements
		 * until specified time duration.
		 */
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		String TitleOfAlertsPage = driver.getTitle();
		System.out.println("TitleOfAlertsPage:"+TitleOfAlertsPage);
		if(TitleOfAlertsPage.equals("ToolsQA")) {
			System.out.println("Tile of page is validated");
		}else {
			System.out.println("Tile of page is not validated");
		}
		
		
		//validating NormalAlert
		driver.findElement(By.id("alertButton")).click();
		objAlert = driver.switchTo().alert();
		String AlertText = objAlert.getText();
		if(AlertText.equals("You clicked a button")) {
			objAlert.accept();
		}else {
			System.out.println("AlertText is not validated");
		}
		
		//timer Alert
		driver.findElement(By.id("timerAlertButton")).click();
		
		//Explicit wait : applicable for one webElement .
		//It will wait until Expected condition is satisfied until specified time duration
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
		
		objAlert = driver.switchTo().alert();
		String TimerAlertText = objAlert.getText();
		System.out.println("TimerAlertText:"+TimerAlertText);
		if(TimerAlertText.equals("This alert appeared after 5 seconds")) {
			objAlert.accept();
		}else {
			System.out.println("AlertText is not validated");
		}
		
		
		//confirm ALert
		
		driver.findElement(By.id("confirmButton")).click();
		objAlert = driver.switchTo().alert();
		String COnformAlertText = objAlert.getText();
		System.out.println("COnformAlertText:"+COnformAlertText);
		if(COnformAlertText.equals("Do you confirm action?")) {
			objAlert.dismiss();
		}else {
			System.out.println("AlertText is not validated");
		}
		
		String TextResult = driver.findElement(By.id("confirmResult")).getText();
		System.out.println("TextResult:"+TextResult);
		if(TextResult.equals("You selected Cancel")) {
			System.out.println("confirm ALert is validated by clicking on cancel");
		}else {
			System.out.println("confirm ALert is not validated");
		}
		
		//prompt Alert
		
		driver.findElement(By.id("promtButton")).click();
		objAlert = driver.switchTo().alert();
		objAlert.sendKeys("I am learning Alerts");
		
		String PromptResult = driver.findElement(By.id("promptResult")).getText();
		System.out.println("promptResult:"+PromptResult);
		if(PromptResult.equals("You entered I am learning Alerts")) {
			System.out.println("PromptResult ALert is validated by entering information");
		}else {
			System.out.println("PromptResult ALert is not validated");
		}
		
		
	}

}
