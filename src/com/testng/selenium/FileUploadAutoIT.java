package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadAutoIT {
	
	@Test
	public void setUp() throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		Runtime.getRuntime().exec("C:\\AutoIT Files\\Fileupload.exe");
		
		
		//driver.quit();
	}

}
