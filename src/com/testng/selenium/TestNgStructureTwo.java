package com.testng.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgStructureTwo {
	
	@BeforeTest
	public void setUp() {
		System.out.println("Browser Open");
		
	}
	
	
	@BeforeMethod
	public void urlLoading() {
		System.out.println("Url loading");
		
	}
	
	
	@Test (priority = 2)
	public void test1() {
		System.out.println("TestOne.");
	}
	
	@Test (priority = 3, invocationCount = 2 , enabled = false)
	public void test2() {
		System.out.println("TestTwo.");
	}
	
	@Test (priority = 1, dependsOnMethods = {"test1"})
	public void test3() {
		System.out.println("TestThree.");
	}
	
	
	@AfterMethod
	public void report() {
		System.out.println("Report");
		
	}
	
	
	@AfterTest
	public void browserClose() {
		System.out.println("Close");
		
	}
	

}
