package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pagespackage.FbLogin;

public class FbLoginTest {
	
	
	@Test
	public void testOne() {
		WebDriver driver =  new ChromeDriver();
				
		driver.get("https://www.facebook.com/login/");
		
		FbLogin fb2 = new FbLogin(driver);
		
		fb2.setValues("abc@gmail.com", "abc@123");
		
		fb2.login();
	}

}
