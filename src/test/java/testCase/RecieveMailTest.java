package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.RecieveMailPage;

public class RecieveMailTest {
	
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver =new EdgeDriver();
		//delete all cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://gmail.com/");
 
	}
	@Test
	public void Gmaillogin() throws InterruptedException {
		//object
		RecieveMailPage rm = new RecieveMailPage(driver);
		rm.ID(" ram021seetha@gmail.com");
		rm.nxt();
		Thread.sleep(2000);
		rm.password("RAMUSEETHA");
		rm.next();
		rm.listmail();
		//rm.Nxt();
	
 
	}

}
