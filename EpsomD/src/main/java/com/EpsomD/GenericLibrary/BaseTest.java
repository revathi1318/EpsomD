package com.EpsomD.GenericLibrary;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.EpsomD.ExcelFileLibrary.ReadExcelFile;
import com.EpsomD.Pagerepository.PageManagement;
import com.EpsomD.Pagerepository.WelcomePage;
import com.EpsomD.PropertyFileLibrary.ReadPropertyFile;
import com.EpsomD.WebDriverLibrary.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * This Class is used to configure all the PreCondition and PostCondition for the TestScript
 * and also Initializing all the library Utility class
 * 
 * @author Revathi*/
public class BaseTest {

	 
	public PageManagement pagemanagementobj;
	public WebDriverUtility webdriverobj;
	public ReadExcelFile excelutilityobj;
	public String username;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public ReadPropertyFile propertyfileobj;
	@BeforeSuite
	public void suiteSetup() {
		        // create the Spark report
				spark = new ExtentSparkReporter("./AdvanceReports/report.html");

				// configure the spark report information
				spark.config().setDocumentTitle("Regresstion Testing for the Learning selenium page");
				spark.config().setReportName("RegressionSuite||Verification of welcome page");
				spark.config().setTheme(Theme.STANDARD);

				// create the extent report
				report = new ExtentReports();

				// Attach the spark report and Extent report
				report.attachReporter(spark);

				
				// configure the system information in Extent Report
				report.setSystemInfo("DeviceName", "Harry");
				report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
				report.setSystemInfo("Browser : ", "Chrome");
				report.setSystemInfo("Browser version", "chrome-128.0.6613.85");

	}
	
	@AfterSuite
	public void suiteTerminateSetup() {
		// Flush the report information
		report.flush();
		
	}
	
	
	@Parameters({"browsername","weburl"})
	@BeforeClass
	public void browserSetup(String browser, String url) {
		//create Object for all the Repository/Utility
	     createObjects();
	     
		//Fetch the Username from the external file
		username = excelutilityobj.readSingleData("RegisterData",1,1);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the browser");
//		String browsername = sc.next();
		// Step 1: Launch the Browser----->Chrome,Edge,Safari
		webdriverobj.launchBrowser(browser);
		Reporter.log("Step1: Launch the Browser Success",true);

		// Maximize the browser
		webdriverobj.maximizeTheBrowser();
		Reporter.log("Step1.1: Maximizing the Browser Success",true);
		// Step 2 : Navigating to the Application via URL
		 webdriverobj.navigateToApplication(url);
		Reporter.log("Step:2 Navigation to the Application via URL Success",true);

	}

	// For terminate Browser
	@AfterClass
	public void terminateBrowser() {
		//Step10: Terminating browser
		webdriverobj.closeAllBrowser();
		Reporter.log("Step10: Close the Browser Success", true);
	}
	
	public void createObjects() {
	webdriverobj = new WebDriverUtility();
    excelutilityobj= new  ReadExcelFile();
    propertyfileobj= new ReadPropertyFile();
	}
	
	
	
	

}


