package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util1.util1;

public class Profilepage extends util1 {
	 WebDriver driver;
	 @FindBy(xpath="(//a[@class='_2kxeIr'])[1]")
	 private WebElement myprofile;
	 @FindBy(xpath="(//div[@class='_28p97w'])[1]")
	 private WebElement profname;
	 @FindBy(xpath="(//div[@class='NS64GK'])[1]")
	 private WebElement manageadress;
	 
	 @FindBy(xpath="//div[@class='_1QhEVk']")
	 private WebElement add;
	 @FindBy(xpath="//input[@name='name']")
	 private WebElement name; 
	 @FindBy (xpath="//input[@name='phone']")
	 private WebElement phone;
	 @FindBy (xpath="(//input[@type='text'])[4]")
	 private WebElement pincode;
	 @FindBy (xpath="(//input[@type='text'])[5]")
	 private WebElement local;
	 @FindBy (xpath="//textarea[@class='_1sQQBU _1w3ZZo _1TO48q']")
	 private WebElement street;
	 @FindBy (xpath="(//label[@class=\"_2Fn-Ln _3iI7Qn\"])[1]")
	 private WebElement homebtn;
	 @FindBy (xpath="//button[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']")
	 private WebElement save;
	 
	 
	 @FindBy (xpath="//a[@class='_3-PJz-']")
	 private WebElement bcmseller;
	 
	 public Profilepage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 this.driver=driver;
		 
	 }
	 
	 public void gotoprofilename() throws InterruptedException {
			
			 WebElement prof = explicitclick(driver ,"(//div[@class='_28p97w'])[1]");
			 mouse(driver, prof );
	 }
	 public void clickmyprofile() throws InterruptedException {
		  myprofile.click();	 
	 }
	 public void movetoseller() throws InterruptedException {
		  explicitclick(driver , "//a[@class='_3-PJz-']");
		 
		  mouse(driver,bcmseller);
	 }
	 public void clickmanageadd() throws InterruptedException {
		  manageadress.click();
	 }
	 public void clicknewadd() throws InterruptedException {
		  add.click();
	 }
	 public void entername()  {
		 name.sendKeys("Pranil");
	}
	 public void enterphone()  {
		 phone.sendKeys("9175310475");
	}
	 public void enterpin()  {
		pincode.sendKeys("413801");
	}
	 public void enterlocal()  {
			local.sendKeys("Daund");
		}
	 public void enteraddress()  {
			street.sendKeys("yadav vasti");
		}
	 public void clickhomebtn()  {
			homebtn.click();
		}
	 public void clicksave()  {
			save.click();
		}
	 
	 
	 
	 
	 
}
