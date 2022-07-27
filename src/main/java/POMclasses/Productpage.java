package POMclasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util1.util1;

public class Productpage extends util1{
	WebDriver driver ;
	@FindBy(xpath="(//a[@class='_1fQZEK'])[1]")
	private WebElement product;
	@FindBy(xpath="//span[@class='_3iRXzi']")//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']
	private WebElement buy;
	@FindBy(xpath="//button[@class='_2KpZ6l RLM7ES _3AWRsL']")
	private WebElement deliver;
	@FindBy(xpath="//button[@class='_2KpZ6l _1seccl _3AWRsL']")
	private WebElement cont;
	@FindBy(xpath="(//div[@class='_2jIO64 _3Uc2dx'])[6]")
	private WebElement cod;
	@FindBy(xpath="//button[@class='_2KpZ6l qhlwny _3AWRsL']")
	private WebElement order;
	
	
	public Productpage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void buy() throws InterruptedException {
	List<String> adress = new ArrayList<>(driver.getWindowHandles());
	for(int i = 0 ; i<adress.size();i++) {
	driver.switchTo().window(adress.get(i));
	
	Thread.sleep(3000);
	try {
	buy.click();
	}catch(Exception a) {
		System.out.println("no button found");
	}
	}
	}
	public void product() throws InterruptedException {
	   explicitclick(driver ,"(//a[@class='_1fQZEK'])[1]");
	    product.click();
}
	public void deliverhere() throws InterruptedException {
		   explicitclick(driver ,"//button[@class='_2KpZ6l RLM7ES _3AWRsL']");
		    deliver.click();
	}
	public void clickcontinue() throws InterruptedException {
		  scroll(driver, cont);
		    cont.click();
	}
	public void clickcod() throws InterruptedException {
		scroll(driver, cod);
		explicitclick(driver ,"//label[@class='_2Fn-Ln _30jOKh _2KEUG6 _18Z3T6 _3L7Pww']");
		    cod.click();
		    Thread.sleep(4000);
	}
	public void clickorder() throws InterruptedException, IOException {
		  order.click();
		  Thread.sleep(20000);
		  screenshot(driver , "order");
		  
	   
	}
	
}

