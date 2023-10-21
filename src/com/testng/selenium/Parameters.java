package com.testng.selenium;

import org.testng.annotations.Test;

public class Parameters {
	
	@org.testng.annotations.Parameters("a")
	
	@Test
	public void main(String a) {
		System.out.println("Value is:" + a);
	}
	
	

}
