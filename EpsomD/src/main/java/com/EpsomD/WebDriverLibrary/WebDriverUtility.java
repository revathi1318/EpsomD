package com.EpsomD.WebDriverLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This class Provides the reusable Methods to perform all Browser related Actions
 * @author Revathi*/
public class WebDriverUtility {
	public static WebDriver driver_static;
	public WebDriver driver;
	public Select selectobj;
	public Actions actionsobj;
	public Robot robotobj;
	public WebDriverWait wait;
/**
 * This Method used to Launche the Specific Browser
 * @param String Browser Name
 * @return void*/
	public void launchBrowser(String browser) {
		
		switch (browser) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver_static=driver;
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver_static=driver;
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver_static=driver;
			break;
		default:
			System.out.println("Invalid Browser Input");
			break;
		}
	}

	/**This Method is used to navigate to the particular URL
	 * @param String URL
	 * @return void*/

	public void navigateToApplication(String url) {
		driver.get(url);
		//driver_static=driver;
	}
	
	/**This Method is used to Maximize the Browser 
	 * @param
	 * @return void*/
	public void maximizeTheBrowser() {
		driver.manage().window().maximize();
		//driver_static=driver;
	}
	
	/**This Method is used to Close the Browser
	 * @param
	 * @return void*/

	public void closeTheBrowser() {
		driver.close();
		//driver_static=driver;
	}

	/**
	 * This Method is used to Close All the Browsers
	 * @param
	 * @return void*/
	public void closeAllBrowser() {
		driver.quit();
		//driver_static=driver;
	}

	/**
	 * This Method is Used to Perform Implicit Waiting
	 * @param long Duration
	 * @return void*/
	public void waitImplicitly(long duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		//driver_static=driver;
	}

	/**
	 * This Method is Used to Perform Explicit Waiting
	 * @param long Duration, WebElement element
	 * @return void*/
	public void waitExplicitly(long duration, WebElement element) {
		wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**This Method is used to Select an Option in DropDown basd on Visisble Text
	 * @param String visibleText, WebElement element
	 * @return void*/
	public void selectOptionInDropDown(String visibleText, WebElement element) {
		selectobj.selectByVisibleText(visibleText);
	}

	/**This Method is used to Select an Option in the DropDown based On Index Value
	 * @param WebElement element, int index
	 * @return void*/
	public void selectOptionInDropDown(WebElement element, int index) {
		selectobj.selectByIndex(index);
	}

	/**This Method is used to Select an Option in the DropDown based on Value
	 * @param WebElement element, String value
	 * @return void*/
	public void selectOptionInDropDown(WebElement element, String value) {
		selectobj.selectByValue(value);
	}

	/**This Method is used to perform MouseHovering action 
	 * @param WebElement element 
	 * @return void */
	public void mouseHovering(WebElement element) {
		actionsobj.moveToElement(element).perform();
	}

	/**This Method is Used to Perform Key Press Action
	 * @param null
	 * @return void*/
	public void pressTheKey() {

		robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**This Method is Used to Perform Key Release Action
	 * @param null
	 * @return void*/
	public void ReleaseTheKey() {
		robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	/**This Method is used to Accept the Allert PopUp
	 * @return void*/
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	/**This Method is used to Dismiss the Allert PopUp
	 * @return void*/
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	/**This Method is used to Transfer control to the Frame base on Index value
	 * @return void*/
	public void switchControlToFrame(int index) {
		driver.switchTo().frame(index);
	}

	/**This Method is used to Transfer control to the Frame base on WebElement Reference 
	 * @return void*/
	public void switchControlToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**This Method is udes to Transfer Control to the Main Page
	 * @return void*/
	public void switchBackToMain() {
		driver.switchTo().defaultContent();
	}

	/**This Method is used to Switch control to Particular Window
	 * @param String windowId
	 * @return void*/
	public void switchControlToWindown(String windowId) {
		driver.switchTo().window(windowId);
	}

}
