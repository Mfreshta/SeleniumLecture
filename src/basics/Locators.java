package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsPractice {
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/");
		
				WebElement email = driver.findElement(By.id("email"));
				WebElement password = driver.findElement(By.id("pass"));
				WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
				email.sendKeys("abc@gmail.com");
				Thread.sleep(3000);
				email.clear();// This method will clear the value
				Thread.sleep(3000);
				email.sendKeys("aaa@gmail.com");
				Thread.sleep(3000);
				password.sendKeys("123456");
				loginButton.click();
			}
		

}


