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
        
        admin.enterUsername();
        admin.enterPassword();
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
        admin.enterUsernamefield();
        admin.selectUsertypefield();
        admin.clickSearch();
	}
}



