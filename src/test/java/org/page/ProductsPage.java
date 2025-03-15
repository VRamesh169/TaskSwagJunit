package org.page;

import org.baseClass.SeleniumBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends SeleniumBaseClass {

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}

	@FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
	private WebElement cartPage;

	public WebElement validateCartPage() {
		return cartPage;
	}
}
