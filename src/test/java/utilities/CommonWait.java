package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;

public class CommonWait {
	
	public static WebDriverWait waitForPresence(String locator) {
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		return wait;
	}
	
	public static WebDriverWait waitForClickable(String locator) {
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		return wait;
	}

}
