package com.testng.selenium;

import java.awt.RenderingHints.Key;
import java.awt.TextField;
import java.sql.Time;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestMariners {
	
	@Test
	public void testOne() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://marinersforex.com/Flights-Booking");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Thread.sleep(5000);
		driver.switchTo().frame("BotPenguin");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[3]/button/span[1]")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		/*WebElement leaving = driver.findElement(By.xpath("//*[@id=\"country-select-demo\"]"));
		leaving.click();
		leaving.sendKeys("Kochi, India ");
		
		Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();*/
		
		//driver.navigate().refresh();
		
		//WebElement leavingFrom = driver.findElement(By.xpath("(//*[@id=\"country-select-demo\"])[1]"));
		//WebElement leavingFrom = driver.findElement(By.id("country-select-demo"));
		//WebElement goingTo = driver.findElement(By.xpath("(//*[@id=\"country-select-demo\"])[2]"));
		
		
		//leavingFrom.sendKeys(Keys.CONTROL+"a");
		//leavingFrom.sendKeys(Keys.DELETE);
		
		
		
		/*leavingFrom.sendKeys(Keys.CONTROL+"a");
		leavingFrom.sendKeys(Keys.DELETE);
		leavingFrom.sendKeys("kochi");
		//leavingFrom.sendKeys(Keys.ARROW_DOWN);
		leavingFrom.sendKeys(Keys.ENTER);*/
		
		/*START
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id=\"country-select-demo\"])[1]")));
		
		Actions act = new Actions(driver);
		act.click();		
		//act.keyDown(leavingFrom, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(leavingFrom, Keys.DELETE).keyUp(Keys.DELETE);
		
		act.sendKeys(leavingFrom, "trivandrum");
		
		act.keyDown(leavingFrom, Keys.ENTER).keyUp(Keys.ENTER);
		
		//act.perform();
		
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id=\"country-select-demo\"])[2]")));
		WebElement arrivingTo = driver.findElement(By.xpath("(//*[@id=\"country-select-demo\"])[2]"));
		
		act.click();
		
		act.keyDown(arrivingTo, Keys.DELETE).keyUp(Keys.DELETE);
		
		Thread.sleep(3000);
		
		act.sendKeys(arrivingTo, "kochi");
		
		Thread.sleep(3000);
		
		act.keyDown(arrivingTo, Keys.ENTER).keyUp(Keys.ENTER);
		
		act.perform();
		END */
		
		
		/*WebElement leavingFrom = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		
		leavingFrom.click();
		
		leavingFrom.sendKeys("kochi");
		
		Thread.sleep(3000);
		
		leavingFrom.sendKeys(Keys.ENTER);
		
		
		//Thread.sleep(3000);
		
		
		WebElement arrivingTo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/section[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		arrivingTo.click();
		
		arrivingTo.sendKeys("bahrain");
		
		Thread.sleep(3000);
		
		arrivingTo.sendKeys(Keys.ENTER);*/
		
	}

}
