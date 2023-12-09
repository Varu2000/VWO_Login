package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.LoginPage;

public class Test_001 extends BasePage{
@Test
	public void loginValid() {
		
		LoginPage login = new LoginPage(driver);
		String title = login.logValid();
//		System.out.println(title);
		Assert.assertEquals(title,"Dashboard");
		login.logout();
		
	}
	
}
