package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
public WebDriver driver;
	
	
	public AdminPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-admin']") private WebElement moreinfolink;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")private WebElement newbutton;
	
	@FindBy(id="username") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(name="user_type")private WebElement usertype;
	@FindBy(name="Create")private WebElement savebutton;
    
    @FindBy(xpath = "//a[@class=\'btn btn-rounded btn-primary\']") private WebElement searchicon;
    @FindBy(id = "un") private WebElement  usernamefield;
    @FindBy(id="ut")private WebElement usertypefield;
    @FindBy(name="Search")private WebElement search;
		
	public void clickMoreInfoLink() {
		moreinfolink.click();
		
	}
	
	public void clickNewButton()
	{
		newbutton.click();
	}
	
	public void enterUsername() {
		username.sendKeys("Dinnya");
	}
	
	public void enterPassword() {
		password.sendKeys("malavika");
	}
	
	public void selectUsertype() {
		Select select=new Select(usertype);
		select.selectByVisibleText("Staff");
	}
	
	public void clickSaveButton() {
		savebutton.click();
	}
	
	public void clickSearchIcon() {
		searchicon.click();
	}
	public void enterUsernamefield()
{
		usernamefield.sendKeys("Dinnya");
		}
	public void selectUsertypefield() {
		Select select=new Select(usertypefield);
		select.selectByVisibleText("Staff");
	}
	public void clickSearch() {
		search.click();
	}
}
