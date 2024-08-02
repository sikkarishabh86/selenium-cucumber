package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import hooks.Hooks;
import utilities.CommonWait;

public class HomePagePO {
	
	CommonWait commonWait = new CommonWait();
	
	public static WebElement formClose() {
		String formCloseButton = "//div[text()='Please complete our Survey']/../i";
		CommonWait.waitForPresence(formCloseButton);
		return Hooks.getDriver().findElement(By.xpath(formCloseButton));
	}

}
