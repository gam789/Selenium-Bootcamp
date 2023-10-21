package com.bootcamp.seleniummore;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerificationSingle {
	
	ChromeDriver driver;
	String baseUrl = "https://www.google.com/webhp";
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void testOne() throws Exception {
		
		URL obj = new URL(baseUrl);
		HttpURLConnection con = (HttpURLConnection)obj.openConnection();
		con.connect();
		
		if(con.getResponseCode() == 200) {
			System.out.println("Valid---" + baseUrl);
		}
		else if(con.getResponseCode() == 404) {
			System.out.println("Broken link---" + baseUrl);
		}
			
	}
	
	@After
	public void close() {
		
	}

}
