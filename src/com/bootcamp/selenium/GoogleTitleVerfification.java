package com.bootcamp.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleTitleVerfification {
	public static void main(String[] args) {
		//TITLE VERIFICATION
		//Object creation and getting URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println(actualTitle + ":Title verified and testcase passed.");
		}
		else {
			System.out.println("Testcase failed.");
		}*/
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		
		driver.close();
	}

}
