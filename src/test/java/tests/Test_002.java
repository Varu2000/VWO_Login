package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.LoginPage;

public class Test_002 extends BasePage {

	String expectedError = "Your email, password, IP address or location did not match";

	@Test(enabled = true)
	public void loginInvalid() {
		LoginPage lgn = new LoginPage(driver);
		String errormsg = lgn.wrongMailPass();
		Assert.assertEquals(errormsg, expectedError);
	}
	@Test(enabled = true)
	public void loginBlankData() {
		LoginPage lgn = new LoginPage(driver);
		String errormsg = lgn.BlankInput();
		Assert.assertEquals(errormsg, expectedError);
	}
	@Test(enabled = true)
	public void logPassBlank() {
		LoginPage lgn = new LoginPage(driver);
		String errormsg = lgn.passBlank();
		Assert.assertEquals(errormsg, expectedError);
	}
	@Test(enabled = true)
	public void loginMailBlank() {
		LoginPage lgn = new LoginPage(driver);
		String errormsg = lgn.emailBlank();
		Assert.assertEquals(errormsg, expectedError);
	}
	@Test(enabled = true)
	public void loginWrongPass() {
		LoginPage lgn = new LoginPage(driver);
		String errormsg = lgn.wrongPass();
		Assert.assertEquals(errormsg, expectedError);
	}
	@Test(enabled = true)
	public void loginWrongMail() {
		LoginPage lgn = new LoginPage(driver);
		String errormsg = lgn.wrongMail();
		Assert.assertEquals(errormsg, expectedError);
	}

}
