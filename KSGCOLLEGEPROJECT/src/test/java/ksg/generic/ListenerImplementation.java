package ksg.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener{
	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
			}
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/"+name+".png");
		
		
		
		try {
			FileUtils.copyFile(src, dest);
		}
		catch (IOException e) {
			
		}
		try {
		}
		catch(NoSuchSessionException e) {
			e.printStackTrace();
		}
		}
	
		
	}

