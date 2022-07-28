package flipkart.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

import Baseclasses.Base1;
import POMclasses.Homepage;
import POMclasses.Loginpage;
import POMclasses.Profilepage;
import Util1.util1;

public class verifyusercanlogin extends util1{
	ExtentHtmlReporter extentreporter ;
	ExtentReports reports ;
	ExtentTest test ;
	
	static WebDriver driver;
   Loginpage lp ;
   Profilepage pp ;
   Homepage hp ;
	@BeforeClass
	public void beforeclass() throws IOException {
		extentreporter = Base1.getHtmlreporter();
		reports = Base1.getreport();
		test = Base1.gettest("verifyusercanlogin");
		driver = Base1.getdriver("chrome");
		
		
		
	}
	@BeforeMethod
	public void beforemethod() {
		lp = new Loginpage(driver);
		pp= new  Profilepage(driver);
		hp = new Homepage(driver);
	}
	@Test (priority=0)
	public void  verifylogin() throws IOException {
		lp.entermail(getproperty("username"));
		lp.enterpass(getproperty("password"));
		lp.loginc();
		
		Assert.assertEquals(hp.getprofilname(), "Pranil"); 
		
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
