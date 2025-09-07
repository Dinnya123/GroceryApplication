package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.BaseClass;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {
	@Test(priority=1,description="susccessfull login with valid credentials")
	public void verifyUserLoginWithValidCredential() throws IOException {
		
		String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();
		
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
}
	@Test(priority=4)
public void verifyUserLoginWithInvalidCredentials() throws IOException {
		
		String userName=ExcelUtility.readStringData(4, 0,"LoginPage");
		String password=ExcelUtility.readStringData(4, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();
}
	
	
	
}
