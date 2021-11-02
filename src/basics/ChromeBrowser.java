package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

		// Step 1: We need to open chrome browser
		// Step 2: we need to pass https://teischool.us/
		// Step 3: tek school wesite should be open

		// 1. We need to setup System.setProperty("key","value")// key
		// ("webdriver.chrome.driver") // value(path to chromedriver.exe)// for windows
		// we will use \\ for path defining // for mac we will use \ for path defining
		// // for mac System.setProperty("webdriver.chrome.driver",
		// "./drivers/chromedriver");

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		/*
		 * we need to create reference to webdriver interface and then create object of
		 * chromedriver
		 */

		WebDriver driver = new ChromeDriver();

		// in selenium we have a method called .get() and it accepts url as string

		driver.get("http://tekschool.us");

	
		
	}
}