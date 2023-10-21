package com.testng.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsExample {
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		
		Assert.assertEquals(actualTitle, expectedTitle, "Test Failed.");
		System.out.println("Pass");
		
	}

}
