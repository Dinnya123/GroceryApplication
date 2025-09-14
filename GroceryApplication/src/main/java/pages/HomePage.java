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

	
	


	
	
	public void clickOnAdminIcon() {
		
		admin.click();

	}
	
	public void clickOnLogOutIcon() {
		logout.click();
	}
	 public String getSignInTitle() {
    	 return signintitle.getText();
	 }
}
