package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.SendMailPage;

public class SendMailTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver =new ChromeDriver();
		//delete all cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://gmail.com/");
		
		
	}
	
	@Test
	public void sendMail() throws InterruptedException {
		//object
		SendMailPage sm = new SendMailPage(driver);
		sm.enterEmail("sophie234sam@gmail.com");
		sm.enterPassword("sam@456sophie");
		sm.clickCompose();
		Thread.sleep(3000);
		sm.enterToreciepient("ram021seetha@gmail.com");
		sm.enterSubject("Gemmart links");
		sm.enterMessage("https://gemmartusa.com/");
		sm.clickSend();
		
		
	}
	
	/*
	 * @AfterClass public void tearDown() { driver.quit();
	 * 
	 * }
	 */

}
