package testCase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import pageObjects.AmazonPage;
import pageObjects.AmazonSearchFunctionality;
import pageObjects.CartPage;
import pageObjects.HomePage;
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
	public void mainpage() throws InterruptedException, IOException {
		HomePage mp= new HomePage(driver);
		mp.place();
		mp.code("562135");
		mp.submit();
		mp.eng();
		mp.button();
		mp.home();
		mp.mobile();
		mp.allmbl();
		mp.apple();
		mp.title();
		mp.homeButton();
		mp.homepagescreenshot();
	}
	
	@Test(priority=4)
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
	
	
	
	@Test(priority=5)
	public void addToCart() throws InterruptedException {
		CartPage cp = new CartPage(driver);
		//String originalWindow = driver.getWindowHandle();
		//assert driver.getWindowHandles().size() == 1;
		cp.Productsearch("samsung s23");
		cp.Searchbutton();
		cp.ProductLink();
		
		Set<String> windowids = driver.getWindowHandles();
		  List<String> windowslist = new ArrayList(windowids); //to retrieve ids 
		  String parentID = windowslist.get(0); 
		  String childID = windowslist.get(2);
		  driver.switchTo().window(childID);
		//Loop through until we find a new window handle
//		for (String windowHandle : driver.getWindowHandles()) {
//		    if(!originalWindow.contentEquals(windowHandle)) {
//		        driver.switchTo().window(windowHandle);
//		        break;
//		    }
//		}
		cp.ProductTitleinPDP();
		cp.Addtocart();
		cp.Proceedtocheckout();
		Thread.sleep(3000);
		cp.ProductnameinCart();
		cp.compareProductName();
	}
}
