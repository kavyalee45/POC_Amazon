package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage {

	public AmazonPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='Account & Lists']")
	WebElement signinbtn;
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement emailenter;

	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement clickcontinue;
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement submit;

	public void clickSignin() {
		signinbtn.click();
	}

	public void Enteremail(String Email) {
		emailenter.sendKeys(Email);
	}

	public void continueclick() {
		clickcontinue.click();
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clicksubmit() {
		submit.click();
	}
	


}
