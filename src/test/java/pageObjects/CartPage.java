package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
	String ProductNameinCart="";
	String ProductTitle = "";
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	@FindBy(xpath="//span[contains(text(),'Buy Now')]//following::input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchbutton;
	
	@FindBy(linkText="Galaxy S23 5G (Green, 8GB, 128GB Storage)")
	//@FindBy(xpath="//span[contains(text(),'Apple iPhone 15 (128 GB) - Black')]")
	//@FindBy(xpath="//img[@alt='Sponsored Ad - Apple iPhone 15 (128 GB) - Blue']")
	WebElement productlink;
	
	
	@FindBy(xpath="//span[@class='bqe']")
	List<WebElement> Options;
	
	@FindBy(linkText="https://www.amazon.in/")
	WebElement linkclick;
	
	@FindBy(xpath="//span[@class=\"a-truncate-cut\"]")
	WebElement productnameinCart;
	 
	@FindBy(id="productTitle")
	WebElement productTitle;
	
	
	public void Productsearch(String seachproduct) {
		searchbox.sendKeys(seachproduct);}
	
	public void Addtocart() {
		addtocart.click();}
	
	public void Proceedtocheckout() {
		proceedtocheckout.click();}
	
	public void Searchbutton() {
		searchbutton.click();}
	
	public void ProductLink() {
		productlink.click();
	}
	public void ProductnameinCart() {
		String ProductNameinCart=productnameinCart.getText();
		System.out.println("Product Name in Cart -- " + ProductNameinCart);
	}
	public void ProductTitleinPDP() {
		String ProductTitle = productTitle.getText();
		System.out.println("Product Name in PDP -- " + ProductTitle);
	}
	public void compareProductName() {
	if(ProductNameinCart.equals(ProductTitle)) {
		System.out.println("Product is Added to Cart Sucessfully");
	}
	else{
		System.out.println("Product is Not Added to Cart");
	}
	}
}
