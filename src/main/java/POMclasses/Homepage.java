package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util1.util1;

public class Homepage extends util1{
	
	WebDriver driver ;
	@FindBy(xpath="//div[text()='Pranil']")
	private WebElement  profilename;
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement searchbox;

	@FindBy (xpath="//button[@type='submit']")
	private WebElement btn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	public String getprofilname() {
		
		util1.explicitwait(driver, "//div[text()='Pranil']" );
		System.out.println(profilename.getText());
		String name =profilename.getText();
		return name ;
	}
	public void search() throws InterruptedException {
		
		searchbox.sendKeys("glue gun");
		explicitclick(driver,"//button[@type='submit']");
		btn.click();
		
		
	}
	
}
