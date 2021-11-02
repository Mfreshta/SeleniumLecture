package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {

	public static void main(String[] args) {

		// in order to click an elment using JavaScript Executor we need to
		// utliize JavaScriptExector interface and use methods are available​
	}

	public static void clickWithJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/*
	 * This method accepts two parameters, a webelement and a string value to pass
	 */
	public static void sendValueWithJS(WebElement element, String value, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('" + element + "').value='" + value + "'");
	}

	/*
	 * This method accepts two parameters a webelement and a string vlaue as date
	 * from calendar the calendar value should be exactly what calendar accepts for
	 * example if calendar accepts "June-01-2021" this should be pass as value or if
	 * calendar accepts "01/01/2021" this should be pass as value
	 */
	public static void selectDateByJS(WebElement element, String date,WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);​
			}

	/*
	 * This method will scroll down to bottom of the page.
	 */
	public static void scrollPageDownWithJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
