package flipkart.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Baseclasses.Base1;
import POMclasses.Homepage;
import POMclasses.Loginpage;
import POMclasses.Profilepage;

public class verifycanaddaddress {
	
//	ExtentHtmlReporter ExtentReporter = null;
//	ExtentReports report = null;
//	ExtentTest test= null ;
	
	
	
	static WebDriver driver;
	 
	
	   Loginpage lp ;
	   Profilepage pp ;
	   Homepage hp ;
		@BeforeClass
		public void beforeclass() throws IOException {
			
			driver = Base1.getdriver("chrome");
		}
		@BeforeMethod
		public void beforemethod() {
			lp = new Loginpage(driver);
			pp= new  Profilepage(driver);
			hp = new Homepage(driver);
		}
		@Test (priority=0)
		public void verifyusercanviewprofile() throws InterruptedException  {
			
			pp.gotoprofilename();
			pp.clickmyprofile();
		}
		@Test(priority=1)
		public void verifyusercanaddaddress() throws InterruptedException {
			pp.movetoseller();
			pp.clickmanageadd();
			pp.clicknewadd();
			pp.entername();
			pp.enterphone();
			pp.enterpin();
			pp.enterlocal();
			pp.enteraddress();
			pp.clickhomebtn();
			pp.clicksave();
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
