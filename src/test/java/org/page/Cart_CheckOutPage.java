package org.page;

import org.baseClass.SeleniumBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Cart_CheckOutPage extends SeleniumBaseClass {

	public Cart_CheckOutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
	private WebElement enterToCart;

	public WebElement enterIntoCartPage() {
		return enterToCart;
	}

	@FindBy(xpath = "//a[text()='CHECKOUT']")
	private WebElement clickCheckOutButton;

	public WebElement getCheckOutButton() {
		return clickCheckOutButton;
	}

	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement enetrFirstName;

	public WebElement getFirstName() {
		return enetrFirstName;
	}

	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement enetrLastName;

	public WebElement getLastName() {
		return enetrLastName;
	}

	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement enterPostalCode;

	public WebElement getPostalCode() {
		return enterPostalCode;
	}

	@FindBy(xpath = "//input[@class='btn_primary cart_button']")
	private WebElement clickContinueButton;

	public WebElement getClickContinueButton() {
		return clickContinueButton;
	}

	@FindBy(xpath = "//div[text()='Checkout: Overview']")
	private WebElement cartOverviewPageValidtaion;

	public WebElement getCartOverviewPage() {
		return cartOverviewPageValidtaion;
	}
	
	@FindBy(xpath = "//a[text()='FINISH']")
	private WebElement clickFinishButton;
	
	public WebElement getClickFinishButton() {
		return clickFinishButton;
	}
}
