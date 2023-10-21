package com.bootcamp.selenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {
	@Test
	public void test() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/GAM/Desktop/Alert.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		//driver.switchTo().alert().dismiss();  or accept();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		if(a.getText().equals("Hello!I am an alert box!!"))
			System.out.println("Proper alert with right content present.");
		else {
			System.out.println("Fail.");
		}
		a.accept();
		
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Alpha");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Beta Gamma");
	
	}
	
	

}
