package com.rough.gam;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerExercise {
	
	
	@Test
	public void testOne() throws Exception {
		String dayVari = "25";
		String monthVari = "December";
		String yearVari = "2023";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://marinersforex.com/Flights-Booking");
		
		driver.manage().window().maximize();
		
		
		
		//Handling ChatBot
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Thread.sleep(5000);
		driver.switchTo().frame("BotPenguin");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[3]/button/span[1]")).click();
		driver.switchTo().defaultContent();
		//END
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/div/button")).click();         
		
		while(true)	{
			WebElement monthElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div"));
			WebElement yearElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div"));
			
			String month = monthElement.getText();
			String year = yearElement.getText();
				
			if(month.equalsIgnoreCase(monthVari) && year.equals(yearVari)) {
					break;
			}
			else {
					driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/button[2]")).click();
			}
				
		}
			
		
		List<WebElement> monthDates = driver.findElements(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button"));
			for(WebElement dates:monthDates) {
					String date=dates.getText();
					if(date.equals(dayVari)) {
						dates.click();
					}
		}
		
		
			
		
	}
}
