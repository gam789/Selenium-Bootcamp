package com.bootcamp.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleContentVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp");
		
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		String s1 = "I'm Feeling Lucky";
		
		if(pageSource.contains(s1)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
		driver.close();
	}

}
