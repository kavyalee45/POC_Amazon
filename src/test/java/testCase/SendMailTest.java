package testCase;

import org.testng.annotations.Test;

import pageObjects.SendMailPage;
import testBase.BaseClass;

public class SendMailTest extends BaseClass {
	
	
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
