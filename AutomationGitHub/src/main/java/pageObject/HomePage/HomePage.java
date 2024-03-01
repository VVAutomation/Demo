package pageObject.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// webElement + action methods
	
	

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[contains(text(),'Swag Labs')]")
	WebElement swagLabsHeader;
	
	@FindBy(xpath="//span[contains(text(),'Products')]")
	WebElement productLabel;
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement addToCartButton;
	
	
	public WebElement getHeader() {
		
		return swagLabsHeader;
	}


	public WebElement getProductLabel() {
		
		return productLabel;
	}
	
	public void addToCart() {
		addToCartButton.click();
	}
	
	

}
