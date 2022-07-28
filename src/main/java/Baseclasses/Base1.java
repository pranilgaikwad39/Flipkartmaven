
package Baseclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util1.util1;

public class Base1 extends util1 {
 static WebDriver driver=null ;
 
 
	 
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
	
}
