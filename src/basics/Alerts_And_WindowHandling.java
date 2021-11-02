package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_And_WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println(driver.getTitle() + " This is parent window title");
		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		crm.click();

		// WINDOWHANDLING

		// in order to switch from parent window to child window we need to use
		// 1. WindowHandles and return type is Set
		Set<String> wh = driver.getWindowHandles();
		// 2. use Iterator collection to iterate through Set
		Iterator<String> iterator = wh.iterator();
		// 3. retrive parent window handler session id in a string
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		System.out.println(parentWindow);
		System.out.println(parentWindow);
		// now we need to swtich from parent window to child window using switch method
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle() + "This is Child window title");

		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		search.click();

		// ALERT

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); // to accept an alert or popup
		driver.switchTo().alert().dismiss();// to deny or dismiss an alert or popup

		// In order to handle authentication Popups we have to pass user and pass
		// through url

		String userName = "admin";
		String password = "admin";
		// http://username:password@the-internet.herokuapp.com/basic_auth
		String url = "http://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		System.out.println(url);

		driver.navigate().to(url);

	}

}
