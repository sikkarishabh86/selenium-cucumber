package coreFunctions;

import org.openqa.selenium.WebElement;

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

}
