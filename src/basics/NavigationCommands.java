package basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommands {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//We can maximize windows using below methods
		driver.manage().window().maximize();
		//PageloadTimeout will give up to certain amout of time before it throws exception if page
		// is not loaded
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// implicitlyWait is a global wait and applies for entire execution and this applies
		// for WebElement exception if element is not found
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to open a browser we need to use .get() method
		driver.get("https://tekschool.us/");
		System.out.println(driver.getTitle());
		// driver.navigate().to() will open or lunch url as driver.get()
		// main difference: driver.get() will wait for page to load and move to next step
		// 					driver.navigate().to will not wait for page to load and will move on.
		//driver.navigate().to("https://tekschool.us/");
		driver.navigate().refresh(); // this is to refresh the page
		driver.navigate().to("http://tek-school.com/retail/");// this to navigate to next page
		System.out.println(driver.getTitle());
		driver.navigate().back(); // this is to move back to previous url
		System.out.println(driver.getTitle());
		driver.navigate().forward();// this is to move forward to used url.
		// for validations of website title we can use driver.getTitle and return type is string
		System.out.println(driver.getTitle());
		// we can use driver.close to close browsers after testing
		driver.close();
		// we can use driver.quit() to close all browsers that are opened by webdriver
		
	}
	
	}


