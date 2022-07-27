package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
		WebDriver driver ;
		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement email ;
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement login ;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void entermail(String Id) {
		email.sendKeys(Id);
		
	}
	public void enterpass(String pass) {
		
		password.sendKeys(pass);
		
	}
	public void loginc() {
		
		login.click();
}
}
	