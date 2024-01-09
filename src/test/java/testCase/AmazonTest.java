package testCase;

import org.testng.annotations.Test;

import pageObjects.AmazonPage;

public class AmazonTest extends RecieveMailTest {
	
	
	
	@Test
	public void createAccount() throws InterruptedException {

		AmazonPage am = new AmazonPage(driver);
		am.clickSignin();
		am.Enteremail("9398679142");
		am.continueclick();
		am.enterPassword("Bhavya@123");
		am.clicksubmit();
		
}
}