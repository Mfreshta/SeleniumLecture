package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://xndev.com/display-image/");
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		// please make sure you updat the path based on your own file location.
		fileUpload.sendKeys("C:\\Users\\Shaiq\\eclipse-workspace\\Selenium Lectures\\outcome\\firstNameSS.png");

	}

}
