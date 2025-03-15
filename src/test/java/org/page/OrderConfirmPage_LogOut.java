package org.page;

import org.baseClass.SeleniumBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmPage_LogOut extends SeleniumBaseClass {

	public OrderConfirmPage_LogOut() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")

	private WebElement orderConfrim;

	public WebElement getOrderConfrim() {
		return orderConfrim;
	}

	@FindBy(xpath = "//button[text()='Open Menu']")

	private WebElement menuBar;

	public WebElement getMenuBar() {
		return menuBar;
	}

	@FindBy(xpath = "(//a[@style='display: block; outline: none;'])[3]")

	private WebElement logOutButton;

	public WebElement getLogOutButton() {
		return logOutButton;
	}
}
