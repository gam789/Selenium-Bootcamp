package com.testng.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsContextClick {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	}
	
	
	@Test
	public void testOne() {
		
		WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(doubleClick).perform();
		
		
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}

}
