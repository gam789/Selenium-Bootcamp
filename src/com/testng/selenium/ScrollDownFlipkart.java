package com.testng.selenium;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDownFlipkart {
	
	@Test
	public void testOne() throws Exception {
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		
		//Closing pop-up
		driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.
			//js.executeScript("window.scrollBy(0,500)","");
		
		
		//2.
			//WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/footer[1]/div[1]/div[1]/div[1]"));
			//js.executeScript("arguments[0].scrollIntoView();", element);
		
		//3.
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[3]/footer/div/div[3]/div[1]/div[1]/div"));
		new Actions(driver).scrollToElement(element).perform();	
		
		
		
        /*Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 550).perform();*/
                

	}

}
