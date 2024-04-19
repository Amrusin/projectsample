


import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IndependentDependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone Promax 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> Prices = driver.findElements(By.cssSelector("span[class='a-price-whole']"));
		Map<WebElement,Integer> map=new HashMap<WebElement, Integer>();
		for(int i=0; i<Prices.size();i++)
		{
			if(Prices.get(i).getText()!="")
			{
			map.put(Prices.get(i),Integer.parseInt(Prices.get(i).getText().replaceAll(",", "")));	
			}
		}
		List<Entry<WebElement,Integer>> le=new ArrayList<Map.Entry<WebElement,Integer>>(map.entrySet());
		le.sort(Entry.comparingByValue());
		for(Entry e:le)
		{
			System.out.println(e.getValue());
		}
			
driver.close();
	}

	}
