package com.testng.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlLoading() {
		driver.get("https://www.booking.com/");
	}
	
	@Test
	public void testOne() {
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/span[1]")).click();
		
		
		
		
		while(true)	{
			
			WebElement monthElement = driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
			System.out.println(monthElement);
		
			String month = monthElement.getText();
				if(month.equals("November 2023")) {
					System.out.println(month);
					break;
				}
				
				else {
					driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span")).click();
				}
				
				
		}
			
		
		List<WebElement> monthDates = driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
			for(WebElement dates:monthDates) {
					String date=dates.getText();
					if(date.equals("26")) {
						dates.click();
					}
			}
		
		
			
	
		}

}
