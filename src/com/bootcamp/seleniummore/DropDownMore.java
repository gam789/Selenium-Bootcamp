package com.bootcamp.seleniummore;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMore {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@Test
	public void testOne() {
		
		WebElement dayElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day = new Select(dayElement);
		day.selectByIndex(1);
		
		
		List<WebElement> dayList = day.getOptions();
		System.out.println("Daydrop down size:" + dayList.size());
		
		
		for(WebElement days:dayList) {
			System.out.print(days.getText() + " ");
		}
		
		System.out.println();
		WebElement monthElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month = new Select(monthElement);
		month.selectByVisibleText("APR");
		
		List<WebElement> monthList = month.getOptions();
		System.out.println("Monthdrop down size:" + monthList.size());
		
		for(WebElement months: monthList) {
			System.out.print(months.getText() + " ");
		}
		
		
		System.out.println();
		WebElement yearElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year = new Select(yearElement);
		year.selectByValue("1990");
		
		List<WebElement> yearList = year.getOptions();
		System.out.println("Yeardrop down size:" + yearList.size());
		
		for(WebElement years:yearList) {
			System.out.print(years.getText() + " ");
		}
	}
	
	
	
	@After
	public void close() {
		
	}

}
