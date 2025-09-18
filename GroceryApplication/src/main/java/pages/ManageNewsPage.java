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

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") private WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']") private WebElement newstextfield;
	@FindBy(xpath = "//button[@name='create']") private WebElement savebutton;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") private WebElement searchbutton;
	@FindBy(xpath = "//input[@class='form-control']") private WebElement newstitle;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") private WebElement searchbutton1;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']") private WebElement resetbutton;
		
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") private WebElement alertbox;
	@FindBy(xpath = "//td[text()='oopppphhh']") private WebElement text;
	
	
	
	
	
	public ManageNewsPage clickNewButton() {
		newbutton.click();
		return this;
	}
	
	public ManageNewsPage enterTheNews(String textfield) {
		newstextfield.sendKeys(textfield);
		return this;
	
	}
	 public ManageNewsPage clickOnSaveButton() {
		 savebutton.click();
		 return this;
	 }
	 
	 public ManageNewsPage clickOnSearchButton() {
		 searchbutton.click();
		 return this;
		 
	 }
	 public ManageNewsPage enterTheNewsTitle(String textfield1) {
		 newstitle.sendKeys(textfield1);
		 return this;
	 }
	 public ManageNewsPage clickOnSearchButton1() {
		 searchbutton1.click();
		 return this;
	 }
	 public ManageNewsPage clickOnResetButton() {
		 resetbutton.click();
		 return this;
	 }
	 
	
	/* public String getTitleText() {
    	 return enternewstitle.getText();
	 }*/
	public boolean isAlertBoxDisplayed() {
		 return alertbox.isDisplayed();

}
	 public String getText() {
    	 return text.getText();
}
}
