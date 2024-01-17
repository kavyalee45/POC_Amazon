package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecieveMailPage extends BasePage{
	
	public RecieveMailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="identifierId")
	WebElement emailid;
	
	@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button")
	WebElement next;
	
	@FindBy(name="Passwd")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"passwordNext\"]/div/button")
	WebElement Next;
	
	@FindBy(xpath="//span[text()='Ammazon Link']")
	List<WebElement> Options;
//	@FindBy(xpath="//span[@class='bqe']")
//	List<WebElement> Options;
//	
	@FindBy(linkText="https://www.amazon.in/")
	WebElement linkclick;
	
	public void ID(String setemail) {
		emailid.sendKeys(setemail);}
	
	public void nxt() {
		next.click();}
	
	public void password(String setpass) {
		Password.sendKeys(setpass);}
	
	public void next() {
		Next.click();}
	
	public void listmail() {
		for (int i=0;i< Options.size();i++ ) {
	   		  if(Options.get(i).getText().equals("Ammazon Link")) {
	   			  Options.get(i).click();
	   			  break;  }  } }
	
	public void clickLink() {
		linkclick.click();
		Set<String> windowids = driver.getWindowHandles();
		  List<String> windowslist = new ArrayList(windowids); //to retrieve ids 
		  String parentID = windowslist.get(0); 
		  String childID = windowslist.get(1);
		  driver.switchTo().window(childID);
	}
	
	
	


}
