package ksg.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException {
		Reporter.log("openBrowser",true);	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
	}	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);	
		driver.quit();
	}	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);	
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		driver.get(url);
		
		
	}	
	@AfterMethod
	public void logOut() {
		Reporter.log("logOut",true);
		//driver.quit();
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}	
}
