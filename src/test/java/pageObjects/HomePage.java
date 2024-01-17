package pageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
		
	
	@FindBy(xpath = "//*[@id=\"nav-global-location-popover-link\"]")
	WebElement location;

	@FindBy(xpath = "//*[@id=\"GLUXZipUpdateInput\"]")
	WebElement pinCode;

	@FindBy(xpath = "//*[@id=\"GLUXZipUpdate\"]/span/input")
	WebElement apply;

	@FindBy(xpath = "//a[@aria-label='Choose a language for shopping.'][1]")
	WebElement lang;

	@FindBy(xpath = "//*[@id=\"icp-save-button\"]/span/input")
	WebElement cngbtn1;

	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	WebElement menu;

	@FindBy(xpath = "//div[normalize-space()='Mobiles, Computers']")
	WebElement menu1;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul[26]/li[3]/a")
	WebElement menu2;

	@FindBy(xpath = "//span[text()='Apple' and @class='a-size-base a-color-base']")
	WebElement product;

	@FindBy(xpath = "//span[contains(text(),'20W USB-C Power Adapter')]")
	WebElement ptitle;

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	WebElement homebtn;

	public void place() {
		location.click();
	}

	public void code(String pincode) {
		pinCode.sendKeys(pincode);

	}

	public void submit() throws InterruptedException {
		apply.click();
		Thread.sleep(5000);

	}

	public void eng() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(lang));
		try {
			lang.click();
		} catch (ElementClickInterceptedException e) {
			// Refresh the page
			driver.navigate().refresh();

			// Try to locate the element again
			WebElement laung = driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.'][1]"));
			laung.click();
		}

	}

	public void button() throws InterruptedException {
		Thread.sleep(3000);
		cngbtn1.click();
		Thread.sleep(3000);
	}

	public void home() throws InterruptedException {
		Thread.sleep(5000);
		menu.click();
	}

	public void mobile() throws InterruptedException {
		Thread.sleep(2000);
		menu1.click();
	}

	public void allmbl() throws InterruptedException {
		Thread.sleep(2000);
		menu2.click();
	}

	public void apple() {
		product.click();
	}

	public void title() {
		System.out.println(ptitle.getText());
	}

	public void homeButton() {
		homebtn.click();
	}
	public void homepagescreenshot() throws IOException, InterruptedException {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshotFile, new File(".//Screenshot/screenshot.png"));
		  System.out.println("Screenshot Captured Successfully");
		  Thread.sleep(2000);
	}
}


