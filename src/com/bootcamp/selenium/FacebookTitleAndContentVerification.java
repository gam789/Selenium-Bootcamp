package com.bootcamp.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleAndContentVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TITLE VERIFICATION
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle = "Facebook – log in or sign up";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: Title verified.");
		}
		else {
			System.out.println("Fail: Title different.");
		}
		
		//CONTENT VERIFICATION
		String pageSource = driver.getPageSource();
		if(pageSource.contains(" for a celebrity, brand or business.")) {
			System.out.println("Pass: Content present");
		}
		else {
			System.out.println("Fail: Content not present");
		}
		driver.quit();
	}

}
