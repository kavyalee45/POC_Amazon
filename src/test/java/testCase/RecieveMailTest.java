package testCase;

import org.testng.annotations.Test;

import pageObjects.AmazonPage;
import pageObjects.AmazonSearchFunctionality;
import pageObjects.RecieveMailPage;
import testBase.BaseClass;

public class RecieveMailTest extends BaseClass{
	
	
	@Test(priority=1)
	public void Gmaillogin() throws InterruptedException {
		//object
		RecieveMailPage rm = new RecieveMailPage(driver);
		rm.ID(" ram021seetha@gmail.com");
		rm.nxt();
		Thread.sleep(2000);
		rm.password("RAMUSEETHA");
		rm.next();
		rm.listmail();
		rm.clickLink();
	
 
	}
	
	@Test(priority=2)
	public void createAccount() throws InterruptedException {

		AmazonPage am = new AmazonPage(driver);
		am.clickSignin();
		am.Enteremail("9398679142");
		am.continueclick();
		am.enterPassword("Bhavya@123");
		am.clicksubmit();

}
	@Test(priority=3)
	public void searchFunctionality() {
		AmazonSearchFunctionality as=new AmazonSearchFunctionality(driver);
		as.EnterSearch("Laptop");
		as.clickSearch();
		as.EnterinSearch("Laptpp");
		as.clickinSearch();
		as.selectDropdown();
		as.item();
		as.clickSearch2();
	}
}
