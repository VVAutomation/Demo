package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pageObject.HomePage.CheckOutOverViewPage;
import pageObject.HomePage.CheckOutPage;
import pageObject.HomePage.ConfirmationPage;
import pageObject.HomePage.HomePage;
import pageObject.HomePage.YourCartPage;
import pageObject.Login.LoginPage;

public class EndToEndTest extends TestBase {

	LoginPage login;
	HomePage home;
	ConfirmationPage confirmation;
	CheckOutPage checkOut;
	CheckOutOverViewPage overView;
	YourCartPage yourCart;

	@BeforeClass
	public void setUpClass() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		confirmation = new ConfirmationPage(driver);
		checkOut = new CheckOutPage(driver);
		overView = new CheckOutOverViewPage(driver);
		yourCart = new YourCartPage(driver);

	}

	@Test(priority = 0)
	public void loginUserTest() {

		login = new LoginPage(driver);
		login.doLogin("standard_user", "secret_sauce");
		//home.addToCart();

	}

	@Test(priority = 1, dependsOnMethods = "loginUserTest",enabled = false)
	public void addItemToCartTest() {

	}

}
