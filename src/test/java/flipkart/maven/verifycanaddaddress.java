package flipkart.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Baseclasses.Base1;
import POMclasses.Homepage;
import POMclasses.Loginpage;
import POMclasses.Profilepage;
import Util1.util1;

public class verifycanaddaddress extends util1 {
	
	ExtentHtmlReporter extentreporter = null;
	ExtentReports reports = null;
	ExtentTest test= null ;
	
	
	
	static WebDriver driver;
	 
	
	   Loginpage lp ;
	   Profilepage pp ;
	   Homepage hp ;
		@BeforeClass
		public void beforeclass() throws IOException {
			extentreporter = Base1.getHtmlreporter();
			reports = Base1.getreport();
			test = Base1.gettest("Verifyusercan add address");
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
		@AfterMethod
		public void aftermethod(ITestResult result) throws IOException {
			if(result.getStatus()== ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName()+ "Test passed");
				}
			else {
				String ss = screenshot(driver,result.getName());
				test.log(Status.FAIL, result.getName()+ "Test fail", MediaEntityBuilder.createScreenCaptureFromPath(ss).build());
				
			}
		}
		@AfterClass
		public void afterclass() {
			reports.flush();
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
