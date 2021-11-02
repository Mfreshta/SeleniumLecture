package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassPracticeFive {

	public static void main(String[] args) throws InterruptedException {

//	
//		create a class in practice package and name it ClassPracticeFive
//		- Open Test Environment and move mouse over Laptops & NoteBooks
//		- double click on Show All Laptops & Notebooks element
//		- Sort by price (low> high) on short by dropdown
//		- navigate to https://ksrtc.in/oprs-web/ and click on app Store element
//		- then switch driver to child window and print title and close this window
//		- switch back to parent and click on Serch for Bus option. then accept the alert		

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		WebElement laptopANdNotebook = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		laptopANdNotebook.click();
		
		WebElement showAll = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		Actions show = new Actions(driver);
		show.doubleClick(showAll).build().perform();
		
		
		WebElement sortByPrice = driver.findElement(By.id("input-sort"));
		Select sort = new Select(sortByPrice);// we use select class to handle static dropdown
		//sort.selectByIndex(3); //selecting by index number method
		sort.selectByVisibleText("Model (Z - A)");// selecting by selectByVisibleText method
		//sort.selectByValue("http://tek-school.com/retail/index.php?route=product/category&path=18&sort=rating&order=DESC");
		
		Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		driver.close();
			
		
		
		
		
	}

}
