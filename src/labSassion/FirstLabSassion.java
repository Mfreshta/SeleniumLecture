package labSassion;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstLabSassion {

	public static void main(String[] args) {

		// 1. First step to setup Webdriver to execute a browser we need to setup
		// System.setProperty("webdriver.chrome.driver", "Path to driver.exe file")
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		// for Mac users you need to drag the chromedriver or geckodriver file to
		// terminal
		// and then get the path from terminal and place it in path location.
		System.setProperty("webdriver.chrome.driver", "user/name/drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "user/desktop/drivers/geckodriver");
		// 2. we need to create reference to Webdriver Interface and then create object
		// of
		// browser choice to execute the test cases.
		WebDriver driver = new ChromeDriver(); // if want to run test case on chrome
	    //WebDriver driver = new FirefoxDriver();// if want to run test case on firefox
        // 3. Setup some windows and time properties
		// for maximizing the browser we need to write below codes
		driver.manage().window().maximize();
		// for setting up implicit or global wait we need to write below code
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// for setting up pageload timeout we need to write below code
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		// for lunching a url or opening an application we need to write below code ]
		// and this method accepts an argument as String
		driver.get("url");
		// to get page title we need to write below code
		driver.getTitle(); // return type is a String
		// Navigation commands
		driver.navigate().to("url");// this will lunch a url same as driver.get()
		driver.navigate().refresh(); // this will refresh the page
		driver.navigate().forward(); // this will move to next url if you opened in past and came back
		driver.navigate().back(); // this will move to back url if you are on current url type name = new type();
		driver.close(); // this will close current tab opened by selenium
		driver.quit();// this will close all tabs opened byh selenium
		driver.findElement(By.className("className")); // this will find an element using className locator
		WebElement element = driver.findElement(By.id("id")); // this will find an element using id locator and then it
																// will store it in WebElement interface
		element.click(); // this method will click on an element
		element.clear(); // this method will clear the input value from a field
		element.getText(); // this method will return the text of element from DOM and retunr type is a
							// String
		element.sendKeys("value"); // this method will enter value to an element
		element.isDisplayed(); // this method will check if element is on UI and return type is boolean
		element.isEnabled(); // this method will check if element is enabled, for example if a click button
								// is clickable
		element.isSelected(); // this method will check if a radio button is or check box is selected or no
		// Locators:
		// - ID is number one choice because it is unique
		// - Name attribute: we need to get a unique value of name attribute
		// - className:
		// CssSelector:
		// LinkText:
		// PartialLinkText:
		// Xpath: when we dont have a unique ID and Unique Name or any other locators we
		// use
		// Xpath to find the element in UI. we have two type of Xpath.
		// 1. Absolute: which starts from top of HTML node and goes all the way down to
		// element tag
		// Not recommended to use unless this is the last option
		// it starts with single slash /
		// 2. Relative Xpath: syntax //TagName[@attribute='value']
		// //input[@name='firstname']
		// //TagName[Text()='value'] if element has a value on it
		// //span[text()='My Account']
		// //TagName[contains(text(),'portion of text')]
		// //span[contains(text(),'Wish List')]
		// //TagName[@attribute='value' and @attribute='value']
		// When we want to find list of elements that share same tag such as links with
		// tag a or list of elements on dynamic dropdown then we can use FindElements()
		// and return type of FindElments is a List of WebElements
		// make sure you import java.util.list package
		List<WebElement> elementName = driver.findElements(By.tagName("a"));
		// if elements are not found findElements will return an empty List
		// to get size of a list we need to use below method
		elementName.size();
		// in order to iterate in a list we can use for loop, for each loop
		for (int i = 0; i <= elementName.size(); i++) {
			elementName.get(i).getText();
		}

		// another way to iterate through each index of a list is for each loop
		for (WebElement el : elementName) {
			el.getText();
		}

         // Selenium provides a class name Actions and we can right click, double click
		// mouse hover, and drag and drop.
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform(); // this will double click on element
		action.contextClick(element).build().perform();// this will right click on element
		action.moveToElement(element).build().perform();// this will mouse hover to element
		action.dragAndDrop(element, element).build().perform(); // this will drag an element from source and drop it to
																// target

		// Selenium provides Select class for Static DropDowns that have fixed value
		// and Select Tag.
		// we need to get locator of dropdown element and store it in a WebElement
		// then we need to create Object of Select class and pass WebElement as paramter
		Select select = new Select(element);
		select.selectByIndex(1); // This method will select the value from dropdown by index
		select.selectByValue("value");// this method will select the value from dropdown by vlaue we have in Value
										// attribute of dropdown
		select.selectByVisibleText("visible Text of dropdown");// this method will select the value from dropdown based
																// on value shows on UI

		// Alerts and Browser pops
		// In selenium we can handle alerts, and popups by using switch method
		driver.switchTo().alert().accept(); // this method will accept the alert
		driver.switchTo().alert().dismiss(); // this method will deny the alert
		driver.switchTo().alert().getText(); // this method will get text of alert and return type is a String
		// In selenium we can handle multiple windows with WindowHandles and return type
		// of WindowHandles is Set of String
		// we need to import java.util.Set
		Set<String> windowHandles = driver.getWindowHandles(); // This method will get handles or session Id of each tab
																// on browser and store it in a Set of String
		// to iterate through Set we can use Iterator Collection and it has a method
		// name .next() which will retrieve value of index as long as there is next
		// index on Set
		Iterator<String> iterator = windowHandles.iterator();
		// to get session id of parent window we need to create a String then assign the
		// value from Iterator.next() method
		String parentWindow = iterator.next();
		// to get session id of child window we need to create a String then assign the
		// value from Iterator.next() method
		String childWindow = iterator.next();

		// When child window opens after clicking on a link we need to switch the driver
		// from parent window to child
		driver.switchTo().window(childWindow);

		// Some websites will through Authentication popups
		// in selenium we can handle authentication pop ups by passing the username and
		// passowrd with url
		// syntax is : http://userName:password@the-internet.herokuapp.com/basic_auth
		String userName = "admin";
		String password = "admin";
		// http://username:password@the-internet.herokuapp.com/basic_auth
		String url = "http://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		System.out.println(url);
		driver.navigate().to(url);

	}

}
