package pages.ksg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
	@FindBy(xpath ="(//a[@class='main-btn'])[2]")
	private WebElement stafflogin;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void setStafflogin() {
		stafflogin.click();
	}
		
}
	