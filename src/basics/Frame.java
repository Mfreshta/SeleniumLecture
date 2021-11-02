package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(
				"https://javadoc.io/static/org.seleniumhq.selenium/selenium-api/2.50.1/index.html?org/openqa/selenium/WebDriver.html");

		// in order to handle webelements inside an iframe or frame we need to find
		// frame locator
		// or id then use switchTo().frame
		WebElement framePackage = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		driver.switchTo().frame(framePackage);

		WebElement element = driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']"));
		System.out.println(element.isDisplayed());

		driver.switchTo().defaultContent();

	}

}
