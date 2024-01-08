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

	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
	WebElement emailNext;

	@FindBy(name = "Passwd")
	WebElement password;

	@FindBy(xpath = "//*[@id=\\\"passwordNext\\\"]/div/button/span")
	WebElement passwordNext;

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	WebElement compose;

	@FindBy(xpath = "//input[@id=':bq']")
	WebElement toBox;

	@FindBy(xpath = "//input[@id=':84']")
	WebElement subjectBox;

	@FindBy(xpath = "//div[@id=':9e']")
	WebElement message;

	@FindBy(xpath = "//div[@id=':7u']")
	WebElement sendBtn;

	// action methods
	public void enterEmail(String email) {
		emailID.sendKeys(email);
		emailNext.click();
	}

	public void enterPassword(String pswd) {
		emailID.sendKeys(pswd);
		passwordNext.click();
	}

	public void clickCompose() {
		compose.click();
	}

	public void enterToreciepient(String rec) {
		emailID.sendKeys(rec);
	}

	public void enterSubject(String sub) {
		emailID.sendKeys(sub);
	}

	public void enterMessage(String msg) {
		emailID.sendKeys(msg);
	}

	public void clickSend() {
		sendBtn.click();
	}

}
