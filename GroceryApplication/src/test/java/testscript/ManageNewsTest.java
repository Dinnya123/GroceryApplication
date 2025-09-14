package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constant;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends BaseClass {
	
	
		
		@Test
		public void verifyUserisabletoAddNewNews() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName);
			login.enterPasswordOnPasswordField(password);
			login.clickOnCheckbox();
			login.clickOnLoginButton();
			
		ManageNewsPage news= new ManageNewsPage(driver);
		news.clickMoreinfoLink();
		news.clickNewButton();
		String textfield=ExcelUtility.readStringData(1,0,"ManageNewsPage");

		news.enterTheNews(textfield);
		news.clickOnSaveButton();
		
		
         boolean alertboxDisplay =news.isAlertBoxDisplayed();
 		Assert.assertTrue(alertboxDisplay,Constant.ADDNEWNEWSERROR);

		
}
		@Test
public void verifyUserisabletoSearchNewlyAddedNews() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName);
			login.enterPasswordOnPasswordField(password);
			login.clickOnCheckbox();
			login.clickOnLoginButton();
			
		ManageNewsPage news= new ManageNewsPage(driver);
		news.clickMoreinfoLink();
		news.clickOnSearchButton();
		String textfield1=ExcelUtility.readStringData(2,0,"ManageNewsPage");

		news.enterTheNewsTitle(textfield1);
		news.clickOnSearchButton1();
		
		String expected="oopppphhh";
		String actual=news.getText();
		Assert.assertEquals(actual, expected,Constant.SEARCHNEWNEWSERROR);
		
}
		@Test
public void verifyUserisabletoResetNewlyAddedNews() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName);
			login.enterPasswordOnPasswordField(password);
			login.clickOnCheckbox();
			login.clickOnLoginButton();
			
		ManageNewsPage news= new ManageNewsPage(driver);
		news.clickMoreinfoLink();
		news.clickOnResetButton();
		news.clickOnEditIcon();
		String textfield2=ExcelUtility.readStringData(3,0,"ManageNewsPage");

		news.editTheNewsTitle(textfield2);
		news.clickOnUpdateButton();
		news.clickOnDeleteIcon();
	
		
}
}