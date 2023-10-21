package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagespackage.Fbpage;
import utilitiespackage.ExcelUtil;

public class FbTest extends BaseClass{
	
	@Test
	public void verifyLoginWithValidCred() {
		Fbpage fb1 = new Fbpage(driver);
		
		String xl = "G:\\Data.xlsx";
		String sheet = "Sheet1";
		
		int rowCount = ExcelUtil.getRowCount(xl, sheet);
		
		for(int i=1; i<=rowCount; i++) {
			String UserName = ExcelUtil.getCellValue(xl, sheet, i, 0);
			System.out.println("Username---"+ UserName);
			String Pwd = ExcelUtil.getCellValue(xl, sheet, i, 1);
			System.out.println("Password---"+ Pwd);
			
			//Passing User name and Password as parameters
			//Submitting the data by clicking and login button
			
			fb1.setValues(UserName, Pwd);
			fb1.login();
		}
		
		
		
	}

}
