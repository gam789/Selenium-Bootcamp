package com.bootcamp.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {
	
	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp");
		
		
	}
	
	@Test
	public void test() {
		driver.findElement(By.name("q")).sendKeys("Selenium webdriver downoad", Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}

}
