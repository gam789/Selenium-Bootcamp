package com.bootcamp.seleniummore;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerificationMultiple {
	
	ChromeDriver driver;
	String baseUrl = "https://sprig.store/?gclid=CjwKCAjw38SoBhB6EiwA8EQVLvc-BfTIlOEIYDpAwskmIx4vlg81qTB6taNIeIZ4DqGQ-LGMYxDA1RoCS4oQAvD_BwE";
			
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	
	@Test
	public void TestOne() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link: links) {
			String s = link.getAttribute("href");
			verify(s);
		}
		
		
		
		
	}
	
	public void verify(String link) {
		try {
			
		URL url = new URL(link);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.connect();
		
		if(con.getResponseCode() == 200) {
			System.out.println("Valid link----" + link);
		}
		else if(con.getResponseCode() == 400) {
			System.out.println("Broken link----" + link);
		}
			
	  }
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	
	
	@After
	public void close() {
		
	}

}
