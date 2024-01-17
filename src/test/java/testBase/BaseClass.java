package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;

	@BeforeTest
	@Parameters("browser")
	public void setup() throws IOException {

		/*
		 * switch (br.toLowerCase()) {
		 * 
		 * case "chrome": driver = new ChromeDriver(); break; case "edge": driver = new
		 * EdgeDriver(); break; default: System.out.println("No matching browser");
		 * return; }
		 */
		
		FileReader fis = new FileReader(".\\src\\test\\resources\\config.properties");
		prop = new Properties();
		prop.load(fis);
		
		driver = new EdgeDriver();
		// driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
