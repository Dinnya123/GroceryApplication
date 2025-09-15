package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectDropdownWithVisibleText(WebElement usertype, String Staff) {
		Select select=new Select(usertype);
		select.selectByVisibleText("Staff");

		}
	
	public void selectDropdownWithVisibleText2(WebElement usertypefield, String Staff) {
		Select select=new Select(usertypefield);
		select.selectByVisibleText("Staff");

		}

}
