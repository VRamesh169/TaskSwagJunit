package org.baseClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseClass {

	public static WebDriver driver;

	public void initalizeDriver(String browser_type) {
		switch (browser_type) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}
	}

	public void winMax(String maximum) {

		driver.manage().window().maximize();

	}

	public void launchUrl(String launch_url) {

		driver.get(launch_url);
	}

	public void sendKeysByJava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public void clickByJava(WebElement element) {
		element.click();
	}

	public void navigation(String commands) {

		switch (commands) {

		case "refresh":
			driver.navigate().refresh();
			break;

		case "back":
			driver.navigate().back();
			break;

		case "forward":
			driver.navigate().forward();
			break;

		default:
			break;
		}
	}

	public void mouseOverActions(WebElement target) {

		Actions actions = new Actions(driver);
		actions.moveToElement(target);

	}

	public void selectByRobot() {
		try {

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
		}

	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
		}

	}
}
