package com.bootcamp.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitProgramStructure {
	
	
	@Before
	public void setup() {
		System.out.println("Browser Open");
	}
	
	
	@Test
	public void testone() {
		System.out.println("Test Activities1");
	}
	
	@Test
	public void testtwo() {
		System.out.println("Test Activities2");
	}
	
	
	@After
	public void browserclose() {
	System.out.println("Close Browser");
	}
}
