import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/appearance");
		SearchContext tree1 = driver.findElement(By.tagName("settings-ui")).getShadowRoot();
		SearchContext tree2 = tree1.findElement(By.id("main")).getShadowRoot();
		SearchContext tree3 = tree2.findElement(By.cssSelector("settings-basic-page[class='cr-centered-card-container']")).getShadowRoot();
        SearchContext tree4 = tree3.findElement(By.cssSelector("settings-section[page-title='Appearance']")).getShadowRoot();
        SearchContext tree5 = tree4.findElement(By.cssSelector("settings-appearance-page")).getShadowRoot();
       // SearchContext tree6 = tree5.findElement(By.cssSelector("settings-animated-pages[id='pages']")).getShadowRoot();
        SearchContext tree6 = tree5.findElement(By.cssSelector("settings-toggle-button[label='Show Home button']")).getShadowRoot();
        tree6.findElement(By.cssSelector("cr-toggle[id='control']")).click();
        driver.quit();
	}

}
