package com.bootcamp.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffmailProgram {
	
	
	@Test
	public void test() {
		ChromeDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		/*WebElement createButton = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		//System.out.println(createButton.getAttribute("value"));
		String buttonText = createButton.getAttribute("value");
				
		if(buttonText.equals("Create my account >>")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}*/
		
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		Boolean s1 = logo.isDisplayed();
		if(s1) {
			System.out.println("Logo present");
		}
		else {
			System.out.println("Logo not present");
		}
		
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		Boolean s2 = checkBox.isSelected();
		if(s2) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not selected");
		}
		
		
		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		Boolean s3 = radioButton.isSelected();
		if(s3) {
			System.out.println("Radio selected");
		}
		else {
			System.out.println("Radio not selected");
		}
		
		
	}

}
