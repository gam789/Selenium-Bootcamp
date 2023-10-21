package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testOne() {
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions actions =  new Actions(driver);
		actions.dragAndDrop(drag, drop);
		actions.perform();
		
		String text = drop.getText();
		//System.out.println(text);
		if(text.equals("Dropped!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
