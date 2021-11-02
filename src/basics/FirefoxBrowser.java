package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\malik\\eclipse-workspace\\Selenium Lectures\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://tekschool.us/");

//	WebDriver driver = new FirefoxDriver();
//	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver");
//	driver.get("https://tekschool.us/");
//	driver.get("https://www.amazon.com");
//	driver.manage().window().maximize();
//	Thread.sleep(10000);
//	driver.close();
	}

}
