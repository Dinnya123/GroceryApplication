package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constant;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AdminTest extends BaseClass {
	HomePage homepage;
	AdminPage adminpage;
	
	@Test
	public void verifyUserisabletoAddNewUser() throws IOException {
		
		
		String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		homepage=login.clickOnLoginButton();


		

		adminpage=homepage.clickMoreInfoLink();
        adminpage.clickNewButton();
       // String userName1=ExcelUtility.readStringData(1, 0,"AdminPage");
		//String password1=ExcelUtility.readStringData(1, 1, "AdminPage");

        
        //admin.enterUsername(userName1);
       // admin.enterPassword(password1);
       RandomDataUtility random=new RandomDataUtility();
        String userName1=random.createRandomUserName();
        String password1=random.createRandomPassword();
        
        adminpage.enterUsername(userName1);
        adminpage.enterPassword(password1);
        adminpage.selectUsertype();
        adminpage.clickSaveButton();
        
        boolean alertDisplay=adminpage.isAlertBoxDisplayed();
		Assert.assertTrue(alertDisplay,Constant.ADDNEWUSERERROR);
		
	}
        
	
	@Test
	public void verifyUserisabletoSearchNewUser() throws IOException {
		
		String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName).enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();


        
		adminpage=homepage.clickMoreInfoLink();
       adminpage.clickSearchIcon();
       
        String userName2=ExcelUtility.readStringData(2,0,"AdminPage");

		
       adminpage.enterUsernamefield(userName2);
        adminpage.selectUsertypefield();
        adminpage.clickSearch();
        String expected="Password";
		String actual=adminpage.getPasswordTitleText();
		Assert.assertEquals(actual, expected,Constant.SEARCHNEWUSERERROR);

	}
	
}



