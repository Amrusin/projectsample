import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomClass {

	@FindBy(name="username")
	private WebElement untbx;
	
	@FindBy(name="password")
    private WebElement pwtx;
	
	@FindBy(xpath="//input[@type='submit']x")
   private WebElement login;
   
  /* public PomClass(WebDriver driver)
   {
	 untbx=driver.findElement(By.name("username")) ;
	 pwtx=driver.findElement(By.name("password"));
	 login=driver.findElement(By.xpath("//input[@type='submit']"));
   }
   */
   public void setPomClass(String un, String pw)
   {
	 untbx.sendKeys(un);
	 pwtx.sendKeys(pw);
	 login.click();
   }
   
   public void display()
   {
	   System.out.println(untbx);
	   System.out.println(pwtx);
	   System.out.println(login);
   }
   
	}


