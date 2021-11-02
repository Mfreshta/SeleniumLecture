package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) throws InterruptedException {

//		Create a new class in LocatorPractice
//		1. Set system property for Chrome browser
//		2. Create Reference variable for chromeDriver
//		3. Set pageload timeout to 30 seconds
//		4. Set Implicit wait for 20 seconds
//		5. Maximize browser
//		6. open facebook
//		7. Find Email locator and store it in WebElement
//		8. enter email
//		9. find password locator and store it in webelement
//		10. enter password
//		11. find login locator and store it in webelement
//		12. click on login

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		email.sendKeys("jhfhl.xf,@gmail.com");
		password.sendKeys("987905t");
		Thread.sleep(2000);
		login.click();
		//driver.close();
		
		

	}
}
