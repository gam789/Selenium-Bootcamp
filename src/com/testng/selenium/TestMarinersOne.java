package com.testng.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMarinersOne {
	
	@Test
	public void testOne() throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://marinersforex.com/Flights-Booking");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Thread.sleep(5000);
		driver.switchTo().frame("BotPenguin");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[3]/button/span[1]")).click();
		
		driver.switchTo().defaultContent();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/div/button")).click();
		
		//NextMonth
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/button[2]")).click();
		
		//Date
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[5]/div[1]/button")).click();
		
		//TravellersClasses
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div")).click();
		
		//Adult
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]/p")).click();
		
		
		//Child
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[2]/div/div/div[3]/p")).click();
		
		//Business class
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[1]/fieldset/div/label[2]/span[1]/span[1]/input")).click();
		
		//Done
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[2]/span")).click();
		
		//Search
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input")).click();

	}
	
}
