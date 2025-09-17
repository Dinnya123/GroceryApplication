package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminPage {
public WebDriver driver;
	
	
	public AdminPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")private WebElement newbutton;
	
	@FindBy(id="username") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(name="user_type")private WebElement usertype;
	@FindBy(name="Create")private WebElement savebutton;
    
    @FindBy(xpath = "//a[@class=\'btn btn-rounded btn-primary\']") private WebElement searchicon;
    @FindBy(id = "un") private WebElement  usernamefield;
    @FindBy(id="ut")private WebElement usertypefield;
    @FindBy(name="Search")private WebElement search;
    
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") private WebElement alertbox;
    @FindBy(xpath = "//th[text()='Password']") private WebElement passwordtitle;
		

	
	public AdminPage clickNewButton()
	{
		newbutton.click();
		return this;
	}
	
	public AdminPage enterUsername(String username1) {
		
		username.sendKeys(username1);
		return this;
	}
	
	public AdminPage enterPassword(String password1) {
		password.sendKeys(password1);
		return this;
	}
	
	public AdminPage selectUsertype() {
		PageUtility page=new PageUtility();
		page.selectDropdownWithVisibleText(usertype,Constant.USERTYPEVALUE);
		//Select select=new Select(usertype);
		//select.selectByVisibleText("Staff");
		return this;
	}
	
	public AdminPage clickSaveButton() {
		WaitUtility wait=new WaitUtility();
		wait.waitUntilElementToBeClickable(driver,savebutton);
		savebutton.click();
		return this;
	}
	
	public AdminPage clickSearchIcon() {
		searchicon.click();
		return this;
	}
	public AdminPage enterUsernamefield(String username2)
{
		usernamefield.sendKeys(username2);
		return this;
		}
	public AdminPage selectUsertypefield() {
		PageUtility page=new PageUtility();
		page.selectDropdownWithVisibleText2(usertypefield,Constant.USERTYPEVALUE);
		//Select select=new Select(usertypefield);
		//select.selectByVisibleText("Staff");
		return this;
	}
	public AdminPage clickSearch() {
		search.click();
		return this;
	}
	
	 public boolean isAlertBoxDisplayed() {
		 return alertbox.isDisplayed();
	 }
	 public String getPasswordTitleText() {
    	 return passwordtitle.getText();
     }
}
