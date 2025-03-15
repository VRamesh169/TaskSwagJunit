package org.execute;

import org.baseClass.SeleniumBaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.page.Cart_CheckOutPage;
import org.page.LogInPage;
import org.page.OrderConfirmPage_LogOut;
import org.page.ProductsPage;

public class TC02_LogOutPage extends SeleniumBaseClass {

	public static SeleniumBaseClass seleniumBaseClass;
	public static LogInPage logInPage;
	public static ProductsPage productsPage;
	public static Cart_CheckOutPage cart_CheckOutPage;
	public static OrderConfirmPage_LogOut orderConfirmPage_LogOut;

	@BeforeClass
	public static void browse_launchUrl() {

		seleniumBaseClass = new SeleniumBaseClass();
		seleniumBaseClass.initalizeDriver("chrome");
		seleniumBaseClass.winMax("maximum");

		seleniumBaseClass.launchUrl("https://www.saucedemo.com/v1/");
	}

	@Before
	public void logInPageValidation() {

		logInPage = new LogInPage();
		productsPage = new ProductsPage();

		WebElement userName = logInPage.getUserName();
		seleniumBaseClass.sendKeysByJava(userName, "standard_user");
		System.out.println("UserName Enter Successfully");

		WebElement password = logInPage.getPassword();
		seleniumBaseClass.sendKeysByJava(password, "secret_sauce");
		System.out.println("Password Enter Successfully");

		WebElement loginButton = logInPage.getLoginButton();
		seleniumBaseClass.clickByJava(loginButton);
		System.out.println("Loginh Button Click Successfully");

		WebElement addToCart = productsPage.getAddToCart();
		seleniumBaseClass.clickByJava(addToCart);
		System.out.println("Clik the Product To Add Cart");

		if (productsPage.validateCartPage().isDisplayed()) {

			System.out.println("Product Is Added To Cart Successfully");
		}

	}

	@Test
	public void cartPage_CheckOutPageValidation() {

		cart_CheckOutPage = new Cart_CheckOutPage();

		WebElement enterIntoCartPage = cart_CheckOutPage.enterIntoCartPage();
		seleniumBaseClass.clickByJava(enterIntoCartPage);
		System.out.println("Enter into Cart Page");

		WebElement checkOutButton = cart_CheckOutPage.getCheckOutButton();
		seleniumBaseClass.clickByJava(checkOutButton);
		System.out.println("Click CheckOut Button Successfully");

		WebElement firstName = cart_CheckOutPage.getFirstName();
		seleniumBaseClass.sendKeysByJava(firstName, "Pon Shankar");
		System.out.println("Enter FisrtName Successfully");

		WebElement lastName = cart_CheckOutPage.getLastName();
		seleniumBaseClass.sendKeysByJava(lastName, "Balu");
		System.out.println("Enetr Last Name Successfuly");

		WebElement postalCode = cart_CheckOutPage.getPostalCode();
		seleniumBaseClass.sendKeysByJava(postalCode, "638004");
		System.out.println("Eneter Postal Code Successfully");

		WebElement clickContinueButton = cart_CheckOutPage.getClickContinueButton();
		seleniumBaseClass.clickByJava(clickContinueButton);
		System.out.println("Click Continue Button Successfully");

		if (cart_CheckOutPage.getCartOverviewPage().isDisplayed()) {
			System.out.println("User In Cart OverView Page");
		}

		WebElement clickFinishButton = cart_CheckOutPage.getClickFinishButton();
		seleniumBaseClass.clickByJava(clickFinishButton);
		System.out.println("click Finish successfully");
	}

	@After
	public void orderConfirmPageValidation() {
		try {

			orderConfirmPage_LogOut = new OrderConfirmPage_LogOut();

			if (orderConfirmPage_LogOut.getOrderConfrim().isDisplayed()) {
				System.out.println("Order is Confirmed & User IN Order Confirmation Page");
				
				Thread.sleep(5000);

				seleniumBaseClass.navigation("back");
				seleniumBaseClass.sleep(2000);
				
				seleniumBaseClass.navigation("back");
				seleniumBaseClass.sleep(2000);
				seleniumBaseClass.navigation("back");
				
				seleniumBaseClass.navigation("back");
				seleniumBaseClass.sleep(2000);
				
				seleniumBaseClass.navigation("refresh");
				System.out.println("Navigate To Home Page Successfully");

			}

		} catch (Exception e) {
		}
	}

	@AfterClass
	public static void logOutPageValidation() {
		try {

			orderConfirmPage_LogOut = new OrderConfirmPage_LogOut();

			WebElement menuBar = orderConfirmPage_LogOut.getMenuBar();
			seleniumBaseClass.clickByJava(menuBar);
			System.out.println("Click The Menu bar Successfully");

			WebElement logOutButton = orderConfirmPage_LogOut.getLogOutButton();
			seleniumBaseClass.clickByJava(logOutButton);
			System.out.println("LogOut Successfully");

		} catch (Exception e) {
		}
	}
}
