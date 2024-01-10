package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchFunctionality extends BasePage {

	public AmazonSearchFunctionality(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement search;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement searchBtn;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement Search1;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement searchBtn1;
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div")
	WebElement getdata;
	
	@FindBy(xpath = "//*[@id=\"searchDropdownBox\"]")
	WebElement dropdown;
	
	@FindBy(xpath = "//*[@id=\"searchDropdownBox\"]/option[3]")
	WebElement selectItem;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement searchBtn2;
	
	// methods

	public void EnterSearch(String product) {
		search.sendKeys(product);
	}

	public void clickSearch() {
		searchBtn.click();
	}

	public void EnterinSearch(String product1) {
		search.clear();
		Search1.sendKeys(product1);
	}

	public void clickinSearch() {
		searchBtn1.click();
		// getdata.getText();
		System.out.println(getdata.getText());
		Search1.clear();
	}

	public void selectDropdown() {
		dropdown.click();
	}

	public void item() {
		selectItem.click();
	}

	public void clickSearch2() {
		searchBtn2.click();
	}

}
