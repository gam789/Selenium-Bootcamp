package com.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NotificationDisable {
	
	WebDriver driver;
	
	@Test
	public void test() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);
		
		driver.get("https://www.justdial.com/");
		
		driver.manage().window().maximize();
		
		
	}
}


