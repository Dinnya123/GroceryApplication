package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constant;
import pages.AdminPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AdminTest extends BaseClass {
	
	@Test
	public void verifyUserisabletoAddNewUser() throws IOException {
		
		
		String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();


		
      AdminPage admin=new AdminPage(driver);

        admin.clickMoreInfoLink();
        admin.clickNewButton();
       // String userName1=ExcelUtility.readStringData(1, 0,"AdminPage");
		//String password1=ExcelUtility.readStringData(1, 1, "AdminPage");

        
        //admin.enterUsername(userName1);
       // admin.enterPassword(password1);
       RandomDataUtility random=new RandomDataUtility();
        String userName1=random.createRandomUserName();
        String password1=random.createRandomPassword();
        
        admin.enterUsername(userName1);
        admin.enterPassword(password1);
        admin.selectUsertype();
        admin.clickSaveButton();
        
        boolean alertDisplay=admin.isAlertBoxDisplayed();
		Assert.assertTrue(alertDisplay,Constant.ADDNEWUSERERROR);
		
	}
        
	
	@Test
	public void verifyUserisabletoSearchNewUser() throws IOException {
		
		String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
		String password=ExcelUtility.readStringData(1, 1, "LoginPage");

		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(userName);
		login.enterPasswordOnPasswordField(password);
		login.clickOnCheckbox();
		login.clickOnLoginButton();


		AdminPage admin=new AdminPage(driver);
        
		admin.clickMoreInfoLink();

		admin.clickSearchIcon();
        String userName2=ExcelUtility.readStringData(2,0,"AdminPage");

		
       admin.enterUsernamefield(userName2);
        admin.selectUsertypefield();
        admin.clickSearch();
        String expected="Password";
		String actual=admin.getPasswordTitleText();
		Assert.assertEquals(actual, expected,Constant.SEARCHNEWUSERERROR);

	}
}



