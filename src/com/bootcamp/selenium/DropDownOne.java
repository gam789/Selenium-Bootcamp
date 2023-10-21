package com.bootcamp.selenium;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOne {
	
	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test() {
		WebElement dayElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day = new Select(dayElement);
		day.selectByIndex(0);
		
		List<WebElement> dayList = day.getOptions();
		for(WebElement days:dayList) {
			System.out.print(days.getText()+ " ");
		}
		System.out.println("Day list size: " + dayList.size());
		
		
		
		WebElement monthElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month = new Select(monthElement);
		month.selectByValue("09");
		
		List<WebElement> monthList = month.getOptions();
		for(WebElement months:monthList) {
			System.out.print(months.getText() + " ");
		}
		System.out.println("Month list size: " + monthList.size());
		
		
		
		
		WebElement yearElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year = new Select(yearElement);
		year.selectByVisibleText("1996");
		
		List<WebElement> yearList = year.getOptions();
		for(WebElement years:yearList) {
			System.out.print(years.getText() + " ");
		}
		System.out.println("Year list size: " + yearList.size());
		
	}
	
	@After
	public void close() {
		driver.close();
	}
	
	

}
