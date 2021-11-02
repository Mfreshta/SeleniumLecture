package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverManagerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		// I want to run same test in different browser such as chrome, firefox, Edge
		String browserName = "firefox";
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup(); // This will take care of system.setProperty
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://tekschool.us/");
		
	}

}
