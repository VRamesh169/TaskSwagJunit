package org.page;

import org.baseClass.SeleniumBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends SeleniumBaseClass {

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement UserName;

	public WebElement getUserName() {
		return UserName;
	}

	@FindBy(xpath = ("//input[@id='password']"))
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = ("//input[@id='login-button']"))
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

}
