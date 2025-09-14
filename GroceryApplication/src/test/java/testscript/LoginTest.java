package testscript;

import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {
	@Test(priority=1,description="successfull login with valid credentials",groups= {"smoke"},retryAnalyzer=retryAnalyser.Retry.class)
	public void verifyUserLoginWithValidCredential() throws IOException {
		
		String userName=ExcelUtility.readStringData(1, 9,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();
		boolean dashboardDisplay=login.isDashboardDisplayed();
		Assert.assertTrue(dashboardDisplay,Constant.VALIDCREDENTIALERROR);
		
	}
	@Test(priority=2)
public void verifyUserLoginWithValidUsernameandInvalidPassword() throws IOException {
		
		String userName=ExcelUtility.readStringData(2, 0,"LoginPage");
		String password=ExcelUtility.readStringData(2, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();
		String expected="7rmart supermarket";
		String actual=login.getTitleText();
		Assert.assertEquals(actual, expected,Constant.INVALIDPASSWORDERROR);
	}
	@Test(priority=3)
public void verifyUserLoginWithInvalidUsernameandValidPassword() throws IOException {
		
		String userName=ExcelUtility.readStringData(3, 0,"LoginPage");
		String password=ExcelUtility.readStringData(3, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();
		String expected="Sign in to start your session";
		String actual=login.getSignInTitle1();
		Assert.assertEquals(actual, expected,Constant.INVALIDUSERNAMEERROR);

		
}
	@Test(priority=4,description="user login with invalidcredentials",groups= {"smoke"})
public void verifyUserLoginWithInvalidCredentials() throws IOException {
		
		String userName=ExcelUtility.readStringData(4, 0,"LoginPage");
		String password=ExcelUtility.readStringData(4, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();
		String expected="Sign in to start your session";
		String actual=login.getSignInTitle();
		Assert.assertEquals(actual, expected,Constant.INVALIDCREDENTIALERROR);
}
	
	
	
}
