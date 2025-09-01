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
		
		
		
		public void enterUsernameOnUserNameField(String userName) {
			
			usernamefield.sendKeys(userName);

		}
		
		
		public void enterPasswordOnPasswordField(String password) {
			passwordfield.sendKeys(password);

		}
		
		public void clickCheckboxButton() {
			checkbox.click();
		}
		 public void enterLoginButtononButtonfield()
		 {
				signin.click();

		 }

}
