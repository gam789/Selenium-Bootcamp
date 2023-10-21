package com.testng.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		
	}
	
	
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
	}
	
	
	
	@Test
	public void testOne() {
		WebElement clickHere = driver.findElement(By.xpath("/html/body/p/a"));
		clickHere.click();
		
		String parentWindow = driver.getWindowHandle();
		//System.out.println(parentWindow);
		
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		for(String handle:windows) {
			
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow)) {
				
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmil.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				//driver.close();
				
			}
			
			driver.switchTo().window(parentWindow);
			
			
			
			
		}
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.flipkart.com/");
		
	}

}
