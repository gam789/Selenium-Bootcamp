package com.rough.gam;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkValidation {
	
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sprig.store/account/register");
		
		driver.switchTo().frame("social_login_frame");
		
		List<WebElement> signinLinks = driver.findElements(By.tagName("a"));
		ArrayList<String> actualstringArrayList = new ArrayList<>();
		ArrayList<String> expectedstringArrayList = new ArrayList<>(Arrays.asList("https://social-login.oxiapps.com/auth/facebook?shop=sprigstore-com.myshopify.com&parenturl=https://sprig.store/account/register", 
					"https://social-login.oxiapps.com/auth/google?shop=sprigstore-com.myshopify.com&parenturl=https://sprig.store/account/register", 
					"https://social-login.oxiapps.com/auth/twitter?shop=sprigstore-com.myshopify.com&parenturl=https://sprig.store/account/register",
					"https://social-login.oxiapps.com/auth/linkedin?shop=sprigstore-com.myshopify.com&parenturl=https://sprig.store/account/register",
					"https://social-login.oxiapps.com/auth?type=amazon&shop=sprigstore-com.myshopify.com&parenturl=https://sprig.store/account/register"));

		for(WebElement link:signinLinks) {
			String s = link.getAttribute("href");
			
			
			
			actualstringArrayList.add(s);
			verify(s);
			
		}
		System.out.println(actualstringArrayList);
		Assert.assertEquals(actualstringArrayList, expectedstringArrayList);
		System.out.println("Pass");
		
	}

	private void verify(String s) {
		// TODO Auto-generated method stub
		try {
			URL obj = new URL(s);
			//Typecasting
			HttpURLConnection con = (HttpURLConnection)obj.openConnection();
			
			if(con.getResponseCode() == 200) {
				System.out.println("Valid---" +s);
				System.out.println(con.getResponseCode());
			}
			else {
				System.out.println("Broken link---" +s);
				System.out.println(con.getResponseCode());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		
	}

}
