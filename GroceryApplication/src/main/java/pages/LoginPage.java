package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

		
		public WebDriver driver;
		
		
		public LoginPage(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
		
		@FindBy(name = "username")private WebElement usernamefield;
		@FindBy(name = "password")private WebElement passwordfield;
		@FindBy(xpath = "//label[@for='remember']") private WebElement checkbox;
		@FindBy(xpath ="//button[text()='Sign In']") private WebElement signin;
		@FindBy(xpath = "//p[text()='Dashboard']")private WebElement dashboard;
		@FindBy(xpath = "//b[text()='7rmart supermarket']") private WebElement logintitle;
		@FindBy(xpath = "//p[text()='Admin Users']") private WebElement admin;
		//@FindBy(xpath = "//button[text()='Sign In']") private WebElement signinbutton;
		@FindBy(xpath = "//p[text()='Sign in to start your session']")private WebElement signintitle;
		@FindBy(xpath = "//p[text()='Sign in to start your session']")private WebElement signintitle1;

		
		
		public void enterUsernameOnUserNameField(String userName) {
			
			usernamefield.sendKeys(userName);

		}
		
		
		public void enterPasswordOnPasswordField(String password) {
			passwordfield.sendKeys(password);

		}
		
		public void clickOnCheckbox() {
			checkbox.click();
		}
		 public void clickOnLoginButton()
		 {
				signin.click();

		 }
		 public boolean isDashboardDisplayed() {
			 return dashboard.isDisplayed();
		 }
         public String getTitleText() {
        	 return logintitle.getText();
         }
         public String getSignInTitle1() {
        	 return signintitle1.getText();
         
         }
         public String getSignInTitle() {
        	 return signintitle.getText();
         }
         
}
