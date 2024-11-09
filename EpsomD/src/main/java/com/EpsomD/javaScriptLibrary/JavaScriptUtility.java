package com.EpsomD.javaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.EpsomD.WebDriverLibrary.WebDriverUtility;



public class JavaScriptUtility {
	
		public JavascriptExecutor javascriptobj;
		public void enterDataDisabledElement(WebElement element, String data){
			javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("argument[0].value="+data+"", element);
		}
		public void clickDisabledElement(WebElement element) {
			javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("argument[0].click()", element);
		}
		public void defaultScrollBy() {
			javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("window.scrollBy(1000,1000)");
		}
		public void defaultScrollTo() {
			javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("window.scrollTo(1000,1000)");
		}
		public void scrollView(WebElement element, boolean value) {
			javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			
			javascriptobj.executeScript("argument[0].scrollIntoView("+value+");", element);
		}
}
