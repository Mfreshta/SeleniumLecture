package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/index.php?route=product/category&path=20");
		WebElement sortBy = driver.findElement(By.id("input-sort"));
		// we need to create object of Select class and then use select methods to handle
		// static dropdown
		Thread.sleep(5000);
		Select select = new Select(sortBy);
		select.selectByVisibleText("Model (Z - A)");
		//select.selectByIndex(3);
		//select.selectByValue("");

	}

}
