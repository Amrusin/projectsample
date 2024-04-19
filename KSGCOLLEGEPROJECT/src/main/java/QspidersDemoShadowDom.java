import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersDemoShadowDom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
	SearchContext usrname = driver.findElement(By.cssSelector("div[class='my-3']")).getShadowRoot();
	usrname.findElement(By.tagName("input")).sendKeys("abc");
	
	}
}

