package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.BaseClass;
import pages.AdminPage;
import pages.LoginPage;
import utilities.ExcelUtility;

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
        String userName1=ExcelUtility.readStringData(1, 0,"AdminPage");
		String password1=ExcelUtility.readStringData(1, 1, "AdminPage");

        
        admin.enterUsername(userName1);
        admin.enterPassword(password1);
        admin.selectUsertype();
        admin.clickSaveButton();
        
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
	}
}



