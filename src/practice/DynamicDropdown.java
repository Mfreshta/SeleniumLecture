package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {

//		Steps:
//		1. find dropdown Locator
//		2. store it in WebElement
//		3. enter value using sendKeys
//		4. get list of elements using FindElements
//		5. store it in a list
//		6. iterate through the list
//		7. write an if condition for getting text
//		8. write code to click on element
//		9. break the loop.

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
  to.clear();
  to.sendKeys("London");
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
