package Baseclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Util1.util1;


public class Base1 extends util1 {
 static WebDriver driver=null ;
 static  ExtentHtmlReporter extentreporter = null;
 static	ExtentReports reports = null;
 static	ExtentTest test= null ;
 
	 
	 public static WebDriver getdriver(String browser) throws IOException {
	 
		 if(driver==null) {
		 if(browser.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\browser\\chromedriver.exe");
		       driver = new ChromeDriver();
		       driver.get(getproperty("url"));
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 }else if(browser.equals("firefox"))
			 { System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\browser\\geckodriver.exe");
			  driver = new FirefoxDriver();
			 
			  driver.get("https://www.flipkart.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 }
		 return driver ;
		 }else {
			 return driver ;
		 }
	 }
		 
		 public static ExtentHtmlReporter getHtmlreporter() {
			 if(extentreporter == null) {
				 extentreporter = new ExtentHtmlReporter("extentreport.html");
				 return extentreporter ;
			 }
			 else {
				 return extentreporter ;
			 }
		 }
		 public static ExtentReports getreport() {
			 if(reports== null) {
				 reports = new ExtentReports();
				 reports.attachReporter(extentreporter);
				 
			 }
			 return reports;
		 }
		 public static ExtentTest gettest(String testname) {
			 test = reports.createTest(testname);
			 return test ;
		 }
		 
		 
		 
		 
	 }
	

