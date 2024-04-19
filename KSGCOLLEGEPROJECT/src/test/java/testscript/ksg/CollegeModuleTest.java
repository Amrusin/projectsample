package testscript.ksg;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ksg.generic.BaseClass;
import pages.ksg.Alumni;
import pages.ksg.Homepage;
import pages.ksg.Onlineadmission;
import pages.ksg.Stafflogin;

@Listeners(ksg.generic.ListenerImplementation.class)
public class CollegeModuleTest extends BaseClass{

	//HI welcome to the project
	@Test (priority=1)
	public void testCollegeModule() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("testcollegemodule", true);
		Homepage hm= new Homepage(driver);
		hm.setStafflogin();
		Stafflogin sf=new Stafflogin(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sf.setLogin("un","pw");
	    String etitle=driver.getCurrentUrl();
	    String atitle=driver.getTitle();
	    SoftAssert s=new SoftAssert();
	    s.assertEquals(atitle, etitle);
	    //driver.close();
	    //s.assertAll();
	    
	}
	//hi
@Test (priority=2)
		
	public void onlineAdmission(){
	
		Reporter.log("onlineAdmission", true);
		Onlineadmission oa=new Onlineadmission(driver);
		oa.setOnlinebtn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String url1 = "https://ksgcollege.com/online-admissions.php";
		      String url2 = "https://ksgcollege.com/online-admissions.php1";
		      SoftAssert s1=new SoftAssert();
	          s1.assertEquals(url1, url2);
	        //s1.assertAll();
	}
       @Test (priority=3)
       
       public void alumni() {
    	   Reporter.log("alumini meet 2020", true);
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		Alumni al= new Alumni(driver);
   		
       al.setAlumni();
       al.setReg();
     al.setName("Amrutha");
     al.setGender();
     al.setDob("08121992");
     al.setPresentadd("Bangalore");
     al.setCity("Bangalore");
     al.setState("Karnataka");
     al.setCountry("India");
     al.setPermad("Bangalore");
     al.setCity1("bang");
     al.setState1("Karnataka");
     al.setCountry1("Karnataka");
     al.setphone("8479658425");
     al.setwanum("3896547896");
     al.setSubm();
     /*String url3 = "https://docs.google.com/forms/d/e/1FAIpQLSe-8soMe0-XncoB89nDEu7tNzceei3v0K1PB4dd6Sd6m38btw/formResponse";
     String url4 = "https://docs.google.com/forms/d/e/1FAIpQLSe-8soMe0-XncoB89nDEu7tNzceei3v0K1PB4dd6Sd6m38btw/formResponse";
     SoftAssert s1=new SoftAssert();
     s1.assertEquals(url3, url4);
     s1.assertAll();*/
      
       }
       
	}
