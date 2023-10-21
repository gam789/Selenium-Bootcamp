package com.bootcamp.selenium;



import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDynamic {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//*[contains(@id, 'twotabsearchtextbox')]")).sendKeys("samsung",Keys.ENTER);
		//driver.findElement(By.xpath("//*[contains(@href, '/minitv?ref_=nav_avod_desktop_topnav')]")).click();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[contains(@class,'inputtext _55r1 _6luy')]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[contains(@data-testid,'royal_pass')]")).sendKeys("123");
		driver.findElement(By.xpath("//*[contains(text(), 'Log in')]")).click();
		
		
		
		//driver.close();
	}

}


