package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import hooks.Hooks;
import utilities.CommonWait;

public class HomePagePO {
	
	public static WebElement formClose() {
		String formCloseButton = "//div[text()='Please complete our Survey']/../i";
		CommonWait.waitForPresence(formCloseButton);
		return Hooks.getDriver().findElement(By.xpath(formCloseButton));
	}
	
	public static WebElement contactsButton() {
		String contactsButton = "//a[@href='/contacts']";
		CommonWait.waitForPresence(contactsButton);
		return Hooks.getDriver().findElement(By.xpath(contactsButton));
	}
	
	public static WebElement contactsPlusIcon() {
		String contactsPlusIcon = "//a[@href='/contacts']/../button";
		CommonWait.waitForPresence(contactsPlusIcon);
		return Hooks.getDriver().findElement(By.xpath(contactsPlusIcon));
	}

}
