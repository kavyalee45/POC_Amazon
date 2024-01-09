package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMailPage extends BasePage {

	public SendMailPage(WebDriver driver) {
		super(driver);
	}

	// Elements

	@FindBy(id = "identifierId")
	WebElement emailID;

	@FindBy(xpath = "//*[@id='identifierNext']/div/button/span")
	WebElement emailNext;

	@FindBy(name = "Passwd")
	WebElement password;

	@FindBy(xpath = "//*[@id='passwordNext']/div/button/span")
	WebElement passwordNext;

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	WebElement compose;

	@FindBy(xpath = "//input[contains(@class,'agP')]")
	WebElement toBox;

	@FindBy(name = "subjectbox")
	WebElement subjectBox;

	@FindBy(xpath = "//div[@class='Am aiL Al editable LW-avf tS-tW']")
	WebElement message;

	@FindBy(xpath = "//div[text()='Send']")
	WebElement sendBtn;
	
	
	
	// action methods
	public void enterEmail(String email) {
		emailID.sendKeys(email);
		emailNext.click();
	}

	public void enterPassword(String pswd) {
		password.sendKeys(pswd);
		passwordNext.click();
	}

	public void clickCompose() {
		
		compose.click();
		
	}

	public void enterToreciepient(String rec) {
		
		toBox.sendKeys(rec);
		
		
	}

	public void enterSubject(String sub) {
		subjectBox.sendKeys(sub);
	}

	public void enterMessage(String msg) {
		message.sendKeys(msg);
	}

	public void clickSend() {
		sendBtn.click();
	}

}
