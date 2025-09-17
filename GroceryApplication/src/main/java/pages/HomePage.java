package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']") private WebElement admin;
	@FindBy(xpath = "//a[@class='dropdown-item'and @href=\'https://groceryapp.uniqassosiates.com/admin/logout\']")private WebElement logout;
	@FindBy(xpath = "//p[text()='Sign in to start your session']")private WebElement signintitle;
	
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']") private WebElement moreinfolink;

	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement moreInfo;

	public HomePage clickOnAdminIcon() {
		
		admin.click();
		return this;

	}
	
	public LoginPage clickOnLogOutIcon() {
		logout.click();
		return new LoginPage(driver);
	}
	 public String getSignInTitle() {
    	 return signintitle.getText();
	 }
		public AdminPage clickMoreInfoLink() {
			moreinfolink.click();
			return new AdminPage(driver);
			}
		public ManageNewsPage clickMoreinfoLink() {
			moreInfo.click();
			return new ManageNewsPage(driver);
		}
}
