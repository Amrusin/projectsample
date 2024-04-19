import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingCreadentialsInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		FileInputStream fis =new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("URL2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		FileInputStream fis1=new FileInputStream("./data/Demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		int rowCount = wb.getSheet("InvalidLogin").getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			try
			{
				 driver.findElement(By.name("username")).sendKeys(un);
				 driver.findElement(By.name("password")).sendKeys(pw);
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[@type='submit']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//a[@href='/parabank/logout.htm']")).click();
				 wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("Pass");	 
			}
			catch(NoSuchElementException e)
			{
				wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("Fail");
			}
		}
		FileOutputStream fos=new FileOutputStream("./data/Demo.xslx");
		wb.write(fos);
		wb.close();

	}

}
