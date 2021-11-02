package basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		// In order to use Actions class methods in Selenium we need to
		// create object of actions class then we can use methods.
		Actions action = new Actions(driver);
		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		// mouse hover to element
		action.moveToElement(desktops).build().perform();
		// double click to an element
		action.doubleClick(desktops).build().perform();
		// right click on an element or just on UI
		action.contextClick(desktops).build().perform();
		Thread.sleep(5000);
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		// drag and drop with action class in selenium we need to have
		// target and source webelement
		action.dragAndDrop(source, target).build().perform();
 ScreenShot.takeScreenShot(driver, "FirstName");
	}

}
