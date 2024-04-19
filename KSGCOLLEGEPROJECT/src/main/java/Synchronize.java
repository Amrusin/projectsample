import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.id("login1")).sendKeys("amrusindhu@rediffmail.com");
driver.findElement(By.id("password")).sendKeys("Xyz@202308");
driver.findElement(By.name("proceed")).click();
Thread.sleep(2000);

	}

}
