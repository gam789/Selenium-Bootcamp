package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadText {
	
	@Test
	public void testOne() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("G:\\File.pdf");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

}
