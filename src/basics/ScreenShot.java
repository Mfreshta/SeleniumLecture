package basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// in order to store Screenshot file we need to have below jar file
      // apache.commons.io : we need to go to Maven central repository
		// https://mvnrepository.com/artifact/commons-io/commons-io/2.5
		// import Jar file into project build path
		// i need to create an outcome folder in project level to store Screenshots

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		takeScreenShot(driver, "Shot1");
	}

	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		// String for location path
		String path = ".\\outcome\\";
		// we create object of File class and assign value of getScreenShotAs method
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// we use CopyFile method of FileUtils class to copy screenshot captured and
		// store in location
		// we defined in path
		FileUtils.copyFile(file, new File(path + fileName + ".png"));

	}

}
