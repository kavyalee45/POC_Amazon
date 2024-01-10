package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	
	
	@BeforeTest // driver launch
	public void setup() {
		
		 driver = new EdgeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("https://gmail.com/"); 
		  driver.manage().window().maximize();
		
	}
	
	@AfterTest //close
	public void tearDown() {
		driver.close();
	}
	

}
