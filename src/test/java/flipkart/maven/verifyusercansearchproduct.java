package flipkart.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.Base1;
import POMclasses.Homepage;
import POMclasses.Loginpage;
import POMclasses.Productpage;
import POMclasses.Profilepage;

public class verifyusercansearchproduct {
	 static WebDriver driver;
	   Loginpage lp ;
	   Profilepage pp ;
	   Homepage hp ;
	   Productpage prp;
		@BeforeClass
		public void beforeclass() throws IOException {
			driver = Base1.getdriver("chrome");
		}
		@BeforeMethod
		public void beforemethod() {
			lp = new Loginpage(driver);
			pp= new  Profilepage(driver);
			hp = new Homepage(driver);
			prp= new Productpage(driver);
		}
		@Test(priority=0)
		public void verifysearch() throws InterruptedException {
			hp.search();
		}
		@Test(priority=1)
		public void verifybuy() throws InterruptedException, IOException {
			prp.product();
			prp.buy();
			prp.deliverhere();
			prp.clickcontinue();
			prp.clickcod();
			prp.clickorder();
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
