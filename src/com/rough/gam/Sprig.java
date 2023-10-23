package com.rough.gam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sprig {
	
	@Test
	public void test() {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://sprig.store/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[@id=\"sprig-premium-mobile-accessories\"]/div[1]/div/header/div[1]/div[2]/div[3]/div/div[1]/a/span/i")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"sprig-premium-mobile-accessories\"]/div[1]/div/header/div[1]/div[2]/div[3]/div/div[1]/div/form/input[1]"))
		 .sendKeys("iphone 14");
		 
		 driver.findElement(By.xpath("//*[@id=\"sprig-premium-mobile-accessories\"]/div[1]/div/header/div[1]/div[2]/div[3]/div/div[1]/div/form/input[1]"))
		 .sendKeys(Keys.ENTER);
		 
		 WebElement searchResult = driver.findElement(By.xpath("//*[@id=\"products-grid\"]/div[1]/div/div[2]/a"));
		 searchResult.isDisplayed();
		 
		 Assert.assertEquals(searchResult.isDisplayed(), true);
		 
	}

}
