package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends BaseClass {
	HomePage homepage;
	ManageNewsPage managenewspage;
	
		
		@Test
		public void verifyUserisabletoAddNewNews() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox();
			homepage=login.clickOnLoginButton();
			
		//ManageNewsPage news= new ManageNewsPage(driver);
		managenewspage=homepage.clickMoreinfoLink();
		managenewspage.clickNewButton();
		String textfield=ExcelUtility.readStringData(1,0,"ManageNewsPage");

		managenewspage.enterTheNews(textfield).clickOnSaveButton();
		
		
         boolean alertboxDisplay =managenewspage.isAlertBoxDisplayed();
 		Assert.assertTrue(alertboxDisplay,Constant.ADDNEWNEWSERROR);

		
}
		@Test
public void verifyUserisabletoSearchNewlyAddedNews() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox();
			homepage=login.clickOnLoginButton();
			
		//ManageNewsPage news= new ManageNewsPage(driver);
			managenewspage=homepage.clickMoreinfoLink();

		managenewspage.clickOnSearchButton();
		String textfield1=ExcelUtility.readStringData(2,0,"ManageNewsPage");

		managenewspage.enterTheNewsTitle(textfield1);
		managenewspage.clickOnSearchButton1();
		
		String expected="oopppphhh";
		String actual=managenewspage.getText();
		Assert.assertEquals(actual, expected,Constant.SEARCHNEWNEWSERROR);
		
}
		@Test
public void verifyUserisabletoResetNewlyAddedNews() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password).clickOnCheckbox();
			homepage=login.clickOnLoginButton();
			
		//ManageNewsPage news= new ManageNewsPage(driver);
			managenewspage=homepage.clickMoreinfoLink();

		managenewspage.clickOnResetButton();
		String textfield2=ExcelUtility.readStringData(3,0,"ManageNewsPage");

	
	
		
}
}