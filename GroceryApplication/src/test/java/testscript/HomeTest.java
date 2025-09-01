
	package testscript;

	import java.io.IOException;

	import org.testng.annotations.Test;

	import automationCore.BaseClass;
import pages.HomePage;
import pages.LoginPage;
	import utilities.ExcelUtility;

	public class HomeTest extends BaseClass {
		
		
		@Test
		public void verifyUserisabletoLogout() throws IOException {
			
			
			String userName=ExcelUtility.readStringData(1, 0,"LoginPage");
			String password=ExcelUtility.readStringData(1, 1, "LoginPage");

			LoginPage login=new LoginPage(driver);
			login.enterUsernameOnUserNameField(userName);
			login.enterPasswordOnPasswordField(password);
			login.clickOnCheckbox();
			login.clickOnLoginButton();
	
			
			HomePage home=new HomePage(driver);

		
			
			home.clickOnAdminIcon();
			home.clickOnLogOutIcon();
		}
}
