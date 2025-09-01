package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.BaseClass;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {
	@Test
	public void verifyUserLoginWithValidCredential() throws IOException {
		
		String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickCheckboxButton();
		login.enterLoginButtononButtonfield();
		
	}
	@Test
public void verifyUserLoginWithValidUsernameandInvalidPassword() throws IOException {
		
		String userName=ExcelUtility.readStringData(2, 0,"LoginPage");
		String password=ExcelUtility.readStringData(2, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickCheckboxButton();
		login.enterLoginButtononButtonfield();
		
	}
	@Test
public void verifyUserLoginWithInvalidUsernameandValidPassword() throws IOException {
		
		String userName=ExcelUtility.readStringData(3, 0,"LoginPage");
		String password=ExcelUtility.readStringData(3, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickCheckboxButton();
		login.enterLoginButtononButtonfield();
}
	@Test
public void verifyUserLoginWithInvalidCredentials() throws IOException {
		
		String userName=ExcelUtility.readStringData(4, 0,"LoginPage");
		String password=ExcelUtility.readStringData(4, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickCheckboxButton();
		login.enterLoginButtononButtonfield();
}
	
	
	
}
