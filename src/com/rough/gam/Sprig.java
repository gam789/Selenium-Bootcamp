package com.rough.gam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sprig {
	
	@Test
	public void test() throws Exception {
		 WebDriver driver;
		 
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
			
		driver = new ChromeDriver(option);
		 
		 driver.get("https://sprig.store/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[@id=\"sprig-premium-mobile-accessories\"]/div[1]/div/header/div[1]/div[2]/div[3]/div/div[1]/a/span/i")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"sprig-premium-mobile-accessories\"]/div[1]/div/header/div[1]/div[2]/div[3]/div/div[1]/div/form/input[1]"))
		 .sendKeys("iphone 14");
		 
		 driver.findElement(By.xpath("//*[@id=\"sprig-premium-mobile-accessories\"]/div[1]/div/header/div[1]/div[2]/div[3]/div/div[1]/div/form/input[1]"))
		 .sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//*[@id=\"products-grid\"]/div[1]/div/div[1]/div[2]/div/div/form/button")).click();
		 
		 /*driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/div[1]/i[1]")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"shopify-section-template--18012033057044__main\"]/div/div/div/div/div/div/form/div/div[1]/div[1]/table/tbody/tr[2]/td/div/button/span")).click();
		 
		 Thread.sleep(5000);
		 
		 WebElement valueElement = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/span[1]"));
		 String s = valueElement.getText();
		 System.out.println(s);*/
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]")).click();
		 
		 System.out.println(driver.getTitle());
		 
		 
	}

}
