package flipkart.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.Base1;
import POMclasses.Homepage;
import POMclasses.Loginpage;
import POMclasses.Profilepage;
import Util1.util1;

public class verifyusercanlogin extends util1{
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
	public void  verifylogin() throws IOException {
		lp.entermail(getproperty("username"));
		lp.enterpass(getproperty("password"));
		lp.loginc();
		
		Assert.assertEquals(hp.getprofilname(), "Pranil"); 
		
	}
	
	
	
	
	
	
	
	
}
