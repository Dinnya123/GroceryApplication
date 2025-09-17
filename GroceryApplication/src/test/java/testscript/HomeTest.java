
	package testscript;

	import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

	import automationCore.BaseClass;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
	import utilities.ExcelUtility;

	public class HomeTest extends BaseClass {
		HomePage homepage;
		
		
		@Test
		public void verifyUserisabletoLogout() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox();
			homepage=login.clickOnLoginButton();
	
			
			//HomePage home=new HomePage(driver);

		
			
			homepage.clickOnAdminIcon().clickOnLogOutIcon();
			String expected="Sign in to start your session";
			String actual=login.getSignInTitle();
			Assert.assertEquals(actual, expected,Constant.LOGOUTERROR);
		}
}
