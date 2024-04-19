package pages.ksg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onlineadmission {

	@FindBy(xpath="(//a[@class='main-btn mt-55'])[1]")
	private WebElement onlinebtn;


	


public Onlineadmission(WebDriver driver) {
		// TODO Auto-generated constructor stub
	PageFactory.initElements(driver,this);
	}



public void setOnlinebtn() {
	onlinebtn.click();
}


}