package com.task.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginValidationAssert {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void testOne() {
		
		
		String userName = "standard_user";
		String passWord = "secret_sauce";
		
		driver.findElement(By.name("user-name")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		
		driver.findElement(By.name("login-button")).click();
		
		String actual_url = driver.getCurrentUrl();
		String expected_url = "https://www.saucedemo.com/inventory.html";
		
		Assert.assertEquals(actual_url, expected_url);
		System.out.println("Login validated and success.");
	}

}
