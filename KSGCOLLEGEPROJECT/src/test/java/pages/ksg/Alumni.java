package pages.ksg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alumni {

	@FindBy(xpath="//a[@href='Alumni.php']") 
	private WebElement alumni;
	
	@FindBy(xpath="//a[@class='main-btn']")
	private WebElement reg;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement name;
	
	@FindBy(xpath="//span[text()='Female']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@type='date']")
	private WebElement dob;
	
	@FindBy(xpath="(//textarea[@aria-label='Your answer'])[1]")
	private WebElement presentadd;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement city;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement state;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement country;
	
	@FindBy(xpath="(//textarea[@aria-label='Your answer'])[2]")
	private WebElement Permad;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement city1;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement state1;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement country1;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement wanum;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement subm;

	
	
	public Alumni(WebDriver driver) {
		PageFactory.initElements(driver, this);
}

	public void setAlumni() {
		alumni.click();
	}

	public void setReg() {
		reg.click();
	}

	public void setName(String name1)  {
		name.sendKeys(name1);
	}

	public void setGender() {
		gender.click();
	}

	public void setDob(String dob1) {
		dob.sendKeys(dob1);
	}

	public void setPresentadd(String presentadd1) {
		presentadd.sendKeys(presentadd1);
	}
	public void setCity(String city1) {
		city.sendKeys(city1);
	}
	
	public void setState(String state1) {
		state.sendKeys(state1);
    }
	
	public void setCountry(String country1) {
		country.sendKeys(country1);
    }
	
	public void setPermad(String Permad1) {
		Permad.sendKeys(Permad1);
	}
	
	public void setCity1(String citi1) {
		city1.sendKeys(citi1);
	}
	
	public void setState1(String state2) {
		state1.sendKeys(state2);
	}
	
	public void setCountry1(String coun1) {
		country1.sendKeys(coun1);
	}
	
	public void setphone(String mob1) {
		phone.sendKeys(mob1);
	}
	public void setwanum(String wanum1) {
		wanum.sendKeys(wanum1);
	}
	
	public void setSubm() {
		subm.click();
	}
	
}
	
	
	
	
	

	
