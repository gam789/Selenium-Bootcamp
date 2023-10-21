package com.bootcamp.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagname {
	public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	List<WebElement> linkList = driver.findElements(By.tagName("a"));
	
	

	//Size of list
	System.out.println("List size: " +linkList.size());
	
	//Printing all links
	System.out.println("Links are:");
	for(WebElement link:linkList) {
		System.out.println(link.getText() + " " + link.getAttribute("href"));
	}
	
	
	
	}
}
