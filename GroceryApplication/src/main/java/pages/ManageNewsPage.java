package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
public WebDriver driver;
	
	
	public ManageNewsPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement moreInfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") private WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']") private WebElement newstextfield;
	@FindBy(xpath = "//button[@name='create']") private WebElement savebutton;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") private WebElement searchbutton;
	@FindBy(xpath = "//input[@class='form-control']") private WebElement newstitle;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") private WebElement searchbutton1;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']") private WebElement resetbutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=7818&page_ad=1']") private WebElement editicon;
	@FindBy(xpath = "//textarea[@id='news']")private WebElement editnewstextfield;
	@FindBy(xpath = "//button[text()='Update']")private WebElement updatebutton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/delete?del=7818&page_ad=1']")private WebElement deleteicon;
	
	public void clickMoreinfoLink() {
		moreInfo.click();
	}
	
	public void clickNewButton() {
		newbutton.click();
	}
	
	public void enterTheNews(String textfield) {
		newstextfield.sendKeys(textfield);
	
	}
	 public void clickOnSaveButton() {
		 savebutton.click();
	 }
	 
	 public void clickOnSearchButton() {
		 searchbutton.click();
		 
	 }
	 public void enterTheNewsTitle(String textfield1) {
		 newstitle.sendKeys(textfield1);
	 }
	 public void clickOnSearchButton1() {
		 searchbutton1.click();
	 }
	 public void clickOnResetButton() {
		 resetbutton.click();
	 }
	 public void clickOnEditIcon() {
		 editicon.click();
	 }
	 
	 public void editTheNewsTitle(String textfield2) {
		 editnewstextfield.sendKeys(textfield2);
		 
	 }
	 public void clickOnUpdateButton() {
		 updatebutton.click();
	 }
	public void clickOnDeleteIcon() {
		deleteicon.click();
	}

}
