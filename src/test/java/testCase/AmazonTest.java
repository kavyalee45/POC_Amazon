package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AmazonPage;

public class AmazonTest {
	
	@BeforeClass
	public void setUp() {
		driver =new EdgeDriver();
		//delete all cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
	}
	
	WebDriver driver;
	@Test
	public void createAccount() throws InterruptedException {

		AmazonPage am = new AmazonPage(driver);
		am.clickSignin();
		am.Enteremail("9398679142");
		am.continueclick();
		am.enterPassword("Bhavya@123");
		am.clicksubmit();
		//am.CreateAccountbtn();
		//am.EnterFirstName("Bhavya");
		//am.EnterNo("9743220482");
		//am.Enterpassword("Bhavya@123");
		//am.presscontinue();
		//am.clickStartPuzzle();
		//am.finalSub();
}
}