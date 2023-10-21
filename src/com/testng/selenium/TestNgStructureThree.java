package com.testng.selenium;

import org.testng.annotations.Test;

public class TestNgStructureThree {
	
	@Test(groups = {"sanity"})
	public void main1(){
		System.out.println("Main1");
	}
	
	@Test (groups = {"regression"})
	public void main2() {
		System.out.println("Main2");
	}
	
	@Test(groups = {"sanity", "smoke"})
	public void main3() {
		System.out.println("Main3");
	}
	
	@Test(groups = {"regression"})
	public void main4() {
		System.out.println("Main4");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void main5() {
		System.out.println("Main5");
	}

}
