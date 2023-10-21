package com.bootcamp.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitleAndContentVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: Title present");
		}
		else {
			System.out.println("Failed: Title not present");
		}
		
		String pageSource = driver.getPageSource();
		String content = "Under ₹499 | Pocket-friendly fashion";
		
		if(pageSource.contains(content)) {
			System.out.println("Pass: Content present");
		}
		else {
			System.out.println("Failed");
		}
		driver.quit();

	}

}
