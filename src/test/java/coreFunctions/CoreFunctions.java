package coreFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

import static hooks.Hooks.driver;

public class CoreFunctions {

	public static void click(WebElement element, String name) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendKeys(WebElement element, String text) {
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebElement getElement(String locator) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		return element;
	}

	public static void verifyElementPresent(String locator){
		WebElement element= getElement(locator);
		boolean elementPresent= element.isDisplayed();
		if (elementPresent){
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}

	public static long getRandomNumber(){
		Random rand= new Random();
		long randomNumber= rand.nextInt(1000);
		return randomNumber;
	}

}