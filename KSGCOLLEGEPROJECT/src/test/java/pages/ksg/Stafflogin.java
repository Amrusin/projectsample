package pages.ksg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stafflogin {

	@FindBy(id="exampleInputUsername")
	private WebElement untbx;
	
	@FindBy(id="exampleInputPassword")
	private WebElement pwtbx;

	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement sigin;
	
	public Stafflogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		sigin.click();
	}
	
	
}
