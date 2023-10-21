package com.task.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Test
	public void test() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		File filePath = new File("G:\\LogintestData.xlsx");
		FileInputStream file = new FileInputStream(filePath);
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		System.out.println(sheet.getLastRowNum());
		
		for(int i=1; i<=sheet.getLastRowNum(); i++) {
			
			String userName = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username---" +userName);
			
			String passWord = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password---" +passWord);
			
			
			driver.findElement(By.name("username")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(passWord);
			driver.findElement(By.id("submit")).click();
			
			workBook.close();
			
		}
		
		
	}

}
