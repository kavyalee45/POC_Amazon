package testCase;

import org.testng.annotations.Test;

import pageObjects.SendMailPage;
import testBase.BaseClass;

public class SendMailTest extends BaseClass {
	
	
	@Test
	public void sendMail() throws InterruptedException {
		//object
		SendMailPage sm = new SendMailPage(driver);
		sm.enterEmail(prop.getProperty("emailID"));
		sm.enterPassword(prop.getProperty("Password"));
		sm.clickCompose();
		Thread.sleep(3000);
		sm.enterToreciepient(prop.getProperty("reciepientId"));
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
