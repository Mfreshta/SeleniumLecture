package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandPractice {

	public static void main(String[] args) throws InterruptedException {

//		1- Create a new class and name it NavigationCommandPractice
//		2- Open your browser choice either chrome or firefox
//		3- Make sure browser is opened in maximize size
//		4- lunch Amazon website
//		5- Print Amazon website title
//		6- refresh Amazon page
//		7- now navigate to from Amazon to Facebook website
//		8- Print Facebook website title
//		9- lets go to Amazon back
//		10- i am got bored on amazon, so lets go to Facebook and then close browser

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println("Website Title" + driver.getTitle());
		// When we use thread.sleap this is hard stop on execution(you need to
		//handle the exception by try and catch or use the trows exception)
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Website Title" + driver.getTitle());
		Thread.sleep(5000);// this is hard stop on execution
		driver.navigate().back();
		Thread.sleep(5000);// this is hard stop on execution
		driver.navigate().forward();
		Thread.sleep(5000);// this is hard stop on execution
		driver.close();

	}

}
