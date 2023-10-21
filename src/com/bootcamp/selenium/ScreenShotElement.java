package com.bootcamp.selenium;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotElement {
	
	ChromeDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	
	@Test
	public void test() throws Exception {
		
		WebElement maleElement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		File maleScreenshot = maleElement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(maleScreenshot, new File("C:\\Users\\GAM\\Desktop\\Java\\Eclipse\\Complete Selenium Bootcamp\\Screenshots\\malescreenshot.png"));
	}

}
