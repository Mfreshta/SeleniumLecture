package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

			
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/");
		WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		Thread.sleep(5000);
		from.clear();// this line of code will clear existing value
		Thread.sleep(5000);
		from.sendKeys("New"); // this line of code will enter value "wash" to departure field
		// we are storing the values from dropdown list by using FindElements in a List
		// of
		// WebElement //tagName[@attribute='value']/tagname/tagname
		List<WebElement> depart = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		// we are iterating through list index using for each loop
		for (WebElement departure : depart) {
			// if value of element contains the expected value then it will click on that
			// element
			if (departure.getText().contains("JFK")) {
				departure.click();
				break;
			}
		}
		// codes for second dropdown dynamic dropdown
		WebElement to = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		to.clear();
		to.sendKeys("London");
		List<WebElement> arrival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));
		for (WebElement arriv : arrival) {
			if (arriv.getText().equals("LGW - London Gatwick, United Kingdom")) {
				arriv.click();
				break;
			}
		}
		// codes for static dropdown using select class
		WebElement numberOfPassengers = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
		Select select = new Select(numberOfPassengers);
		select.selectByValue("9");
		
	}


}


