package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {
	
	@Test
	public void testOne() throws Exception {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.
			//js.executeScript("window.scrollBy(0,7000)","");
		
		
		//2.
			//WebElement element = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div/div[9]/div/h4[1]"));
			//js.executeScript("arguments[0].scrollIntoView();", element);
		
		//3.
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		

			

	}

}
