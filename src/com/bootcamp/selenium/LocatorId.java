package com.bootcamp.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {
	
	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("abs@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

}
