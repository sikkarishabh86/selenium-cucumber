package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import hooks.Hooks;
import utilities.CommonWait;

public class LoginPagePO {
	
	CommonWait commonWait = new CommonWait();
	
	public static WebElement username() {
		String username = "//input[@name='email']";
		CommonWait.waitForPresence(username);
		return Hooks.getDriver().findElement(By.xpath(username));
	}
	
	public static WebElement password() {
		String password = "//input[@name='password']";
		CommonWait.waitForPresence(password);
		return Hooks.getDriver().findElement(By.xpath(password));
	}
	
	public static WebElement loginButton() {
		String loginButton = "//div[text()='Login']";
		CommonWait.waitForPresence(loginButton);
		return Hooks.getDriver().findElement(By.xpath(loginButton));
	}

}
