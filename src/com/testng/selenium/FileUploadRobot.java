package com.testng.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadRobot {
	
	
	@Test
	public void testOne() throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		
		WebElement selectPdf = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		selectPdf.click();
		
		fileUpload("G:\\File.pdf");
		
		
		
	}
	
		public void fileUpload(String location) throws AWTException {
		
		
			//To copy path to clip board
			StringSelection strSelection = new StringSelection(location);
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
			
			
			//To paste into system window
			Robot robot = new Robot();
			robot.delay(3000);
			
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}

}
