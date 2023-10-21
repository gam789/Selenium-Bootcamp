package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsClassProgram {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
		
	
	
	@BeforeMethod
	public void urlLoading() {
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
		
	
	@Test
	public void testOne() {
		
		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fullName.sendKeys("Mathew Thomas Sam");
		
		WebElement rediffMail = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(fullName, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		actions.keyDown(fullName, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		
		actions.keyDown(rediffMail, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
		actions.build().perform();
		
		
	}
}
