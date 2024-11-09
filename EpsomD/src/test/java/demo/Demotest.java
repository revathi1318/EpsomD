package demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest {

	@Test
	public void Demotesting1() {
	
		//create the Spark report
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//configure the spark report information 
		spark.config().setDocumentTitle("Regresstion Testing for the Learning selenium page");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
		//create the extent report
		ExtentReports report = new ExtentReports();
		
		//Attach the spark report and Extent report
		report.attachReporter(spark);
		
		//configure the system information in Extent Report
		
		report.setSystemInfo("DeviceName", "Harry");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser : ","Chrome");
		report.setSystemInfo("Browser version", "chrome-128.0.6613.85");
		
		//create the Test Information
		ExtentTest test =report.createTest("RegressionTest");
		
		//steps Information
		test.log(Status.INFO,"Step1: Launching the Browser Succesfull");
		
		test.log(Status.INFO,"Step2: Navigating to application via URL is Sucessfull");
		
		test.log(Status.PASS,"Step3: Verifies webpage Sucessfully");
		
		if("Harry".equals("Harry")) {
			test.log(Status.PASS,"Step 4 : Verified the webElements Displayed");
		}else {
			test.log(Status.FAIL,"Step4: Verified the WebElements not Displayed");
		}
		
		
		test.log(Status.SKIP,"Step5: Element is Hidden");
		
		//Flush the report information
		report.flush();
		System.out.println("Execution Done");
	}
	@Test
	public void DemoTest2() {
		
		
		
	}
	
	@Test
	public void DemoTest3() {
		
	}
	
	@Test
	public void DemoTest4() {
		
	}
	
	@Test
	public void DemoTest5() {
		
	}
}