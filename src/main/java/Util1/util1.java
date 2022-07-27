package Util1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class util1 {

	public static String getproperty(String key) throws IOException {
		FileInputStream file = new FileInputStream("Configuration\\config.properties");
		Properties p =new Properties();
		p.load(file);
		
	String property =	p.getProperty(key);
		return property;
	}
	
	public static boolean explicitwait(WebDriver driver ,  String xpath ) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
		
		  boolean element1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	
		  return element1;
	  }
	public static WebElement explicitclick(WebDriver driver, String xpath) {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		  WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		  return element1;
	}
	
	 public static void mouse(WebDriver driver,WebElement element) {
		  Actions act = new Actions(driver);
		  act.moveToElement(element).perform();
	  }
	 public static void scroll(WebDriver driver , WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", element);
		 
	  }
	 public static void screenshot(WebDriver driver ,String name) throws IOException {
			TakesScreenshot ts = (TakesScreenshot)driver ;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\Software Testing Class\\Automation\\Screenshot\\"+name+".jpg");
			FileHandler.copy(source, destination);
		}
	
}
