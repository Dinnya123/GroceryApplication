package testscript;

import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {
	public HomePage homepage;
	@Test(priority=1,description="successfull login with valid credentials",groups= {"smoke"},retryAnalyzer=retryAnalyser.Retry.class)
	public void verifyUserLoginWithValidCredential() throws IOException {
		
		String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox();
		homepage=login.clickOnLoginButton();
		boolean dashboardDisplay=login.isDashboardDisplayed();
		Assert.assertTrue(dashboardDisplay,Constant.VALIDCREDENTIALERROR);
		
	}
	@Test(priority=2)
public void verifyUserLoginWithValidUsernameandInvalidPassword() throws IOException {
		
		String userName=ExcelUtility.readStringData(2, 0,"LoginPage");
		String password=ExcelUtility.readStringData(2, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox().clickOnLoginButton();
		String expected="7rmart supermarket";
		String actual=login.getTitleText();
		Assert.assertEquals(actual, expected,Constant.INVALIDPASSWORDERROR);
	}
	@Test(priority=3)
public void verifyUserLoginWithInvalidUsernameandValidPassword() throws IOException {
		
		String userName=ExcelUtility.readStringData(3, 0,"LoginPage");
		String password=ExcelUtility.readStringData(3, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox().clickOnLoginButton();
		String expected="Sign in to start your session";
		String actual=login.getSignInTitle1();
		Assert.assertEquals(actual, expected,Constant.INVALIDUSERNAMEERROR);

		
}
	@Test(priority=4,description="user login with invalidcredentials",groups= {"smoke"},dataProvider="loginProvider")
public void verifyUserLoginWithInvalidCredentials(String userName,String password ) throws IOException {
		
		//String userName=ExcelUtility.readStringData(4, 0,"LoginPage"); DataProvider is used
		//String password=ExcelUtility.readStringData(4, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox().clickOnLoginButton();
		String expected="Sign in to start your session";
		String actual=login.getSignInTitle();
		Assert.assertEquals(actual, expected,Constant.INVALIDCREDENTIALERROR);
}
	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },
				// new Object[] {ExcelUtility.getStringData(3,
				// 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
		};
	}
	
	
	
}
