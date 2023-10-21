package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
		public static void main(String[] args) {
			// Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the Flipkart website
	        driver.get("https://www.flipkart.com");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();

	        // Scroll down the page using JavaScript executor
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        for (int i = 0; i < 3; i++) {  // You can adjust the number of times you want to scroll
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	            try {
	                Thread.sleep(2000);  // Add a pause to let the content load
	            } 
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

		
		}
}