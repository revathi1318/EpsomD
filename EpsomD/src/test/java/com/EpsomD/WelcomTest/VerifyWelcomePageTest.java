package com.EpsomD.WelcomTest;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.EpsomD.GenericLibrary.BaseTest;
import com.EpsomD.JavaLibrary.JavaUtility;
import com.EpsomD.Pagerepository.PageManagement;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyWelcomePageTest extends BaseTest {

	@Test(priority = 1)
	public void verifyWelcomepageWithValidInput() {
		JavaUtility javaUtility = new JavaUtility();
		// create the Test Information
		test = report.createTest("verifyWelcomepageWithValidInput");

		// Steps Information
		test.log(Status.INFO, "<<---Execution Started Succesfully---->>");

		// Execute the pre-condition---->1.Launch the browser,2.Navigate to URL
		test.log(Status.INFO, "Test-1 Execution Started Successfully");

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify the welcome page Using Title
		String extitle = "Learning Selenium";

		Assert.assertEquals(extitle, webdriverobj.driver.getTitle());
		test.log(Status.PASS, "Title Verified-Pass:");

		// create object of the PageManagement
		pagemanagementobj = new PageManagement(webdriverobj.driver);

		// Verify the name TestField
		boolean result = pagemanagementobj.intitwelcomepage().getNameText().isDisplayed();

		Assert.assertTrue(result);
		test.log(Status.PASS, "Element Verified:Name TextField is Displayed");

		// Step 3 : Perform Action---->Clear
		pagemanagementobj.intitwelcomepage().getNameText().clear();
		test.log(Status.PASS, "Step 3:Clear Action done Successfully for name Text field");

		pagemanagementobj.intitwelcomepage().getNameText().sendKeys("Revathi");
		test.log(Status.PASS, "Step 4:SendKeys Actions Done Successfully");

		// Step 4a :
		pagemanagementobj.intitwelcomepage().getEmail().sendKeys("revathi@gmail.com");
		test.log(Status.PASS, "Step 4a : SendKeys Actions Done Successfully");

		// Step 4b :
		pagemanagementobj.intitwelcomepage().getPassword().sendKeys("vishu");
		test.log(Status.INFO, "Step 4b : SendKeys Actions Done Successfully");

		// Step 4c:
		pagemanagementobj.intitwelcomepage().getMobile().sendKeys("776888686");
		test.log(Status.INFO, "Step 4c : SendKeys Actions Done Successfully");

		// Step 4d:
		pagemanagementobj.intitwelcomepage().getDob().sendKeys("08-10-1995");
		test.log(Status.INFO, "Step 4d : SendKeys Actions Done Successfully");

		// Step 5: Perform Action----->Click
		pagemanagementobj.intitwelcomepage().getFemale().click();
		test.log(Status.INFO, "Step 5 : Click Actions Done Successfully");

		// Step 5a :
		pagemanagementobj.intitwelcomepage().getGoa().click();
		test.log(Status.INFO, "Step 5a : Click Actions Done Successfully");

		// Step 6 :
		Select s1 = new Select(pagemanagementobj.intitwelcomepage().getCountry());
		s1.selectByVisibleText("USA");
		test.log(Status.INFO, "Step 6 : Drop Down Done Successfully");

		// Step 7 :
		pagemanagementobj.intitwelcomepage().getFeedback().sendKeys("Epsomdoms is a best product");
		test.log(Status.INFO, "Step 7 :Feedback Entered Successfully");

		// Step 8 :
		pagemanagementobj.intitwelcomepage().getFile().sendKeys("C:\\Users\\Revathi\\OneDrive\\Documents");
		test.log(Status.INFO, "Step 8 : File Uploaded Succesfully");

		// Step 9 :
		pagemanagementobj.intitwelcomepage().getRegister().click();
		test.log(Status.INFO, "Step 9: Registration Done Successfully");

		// See the Execution
		javaUtility.pause(3000);

		// SoftAssert Statement
		SoftAssert softassertobj = new SoftAssert();

		// verify the Name text
		softassertobj.assertEquals("Contact Us", pagemanagementobj.intitwelcomepage().getContactuslink().getText());
		test.log(Status.INFO, "Step4: Verified text succesfully Contact Us HyperLink ");

		softassertobj.assertAll();

		// Execution Log or Status
		test.log(Status.INFO, "Test-1 Execution Completed Successfully..TestPass..Testpass..>");

	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "verifyWelcomepageWithValidInput")
	public void verifyWelcomepageWithInValidInput() {
		JavaUtility javaUtility = new JavaUtility();
		// create the Test Information
		test = report.createTest("verifyWelcomepageWithValidInput");

		// steps Information

		test.log(Status.INFO, "Test-1 Execution Started Successfully");

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify the welcome page Using Title
		String extitle = "Learning Selenium";
		String actitle = webdriverobj.driver.getTitle();
		
		
		Assert.assertEquals(actitle, extitle);
		test.log(Status.PASS, "Title Verified-Pass:" + actitle);

		
		
		// create object of the PageManagement
		pagemanagementobj = new PageManagement(webdriverobj.driver);

		// Verify the name TestField
		boolean result = pagemanagementobj.intitwelcomepage().getNameText().isDisplayed();

		Assert.assertTrue(result);
		test.log(Status.PASS, "Element Verified:Name TextField is Displayed");

		// Step 3 : Perform Action---->Clear
		pagemanagementobj.intitwelcomepage().getNameText().clear();
		test.log(Status.PASS, "Step 3:Clear Action done Successfully for name Text field");

		pagemanagementobj.intitwelcomepage().getNameText().sendKeys("5y7vh8rt");
		test.log(Status.PASS, "Step 4:SendKeys Actions Done Successfully");

		// Step 4a :
		pagemanagementobj.intitwelcomepage().getEmail().sendKeys("54vvhfs6r");
		test.log(Status.PASS, "Step 4a : SendKeys Actions Done Successfully");

		// Step 4b :
		pagemanagementobj.intitwelcomepage().getPassword().sendKeys("@%$%$");
		test.log(Status.INFO, "Step 4b : SendKeys Actions Done Successfully");

		// Step 4c:
		pagemanagementobj.intitwelcomepage().getMobile().sendKeys("776888686");
		test.log(Status.INFO, "Step 4c : SendKeys Actions Done Successfully");

		// Step 4d:
		pagemanagementobj.intitwelcomepage().getDob().sendKeys("08");
		test.log(Status.INFO, "Step 4d : SendKeys Actions Done Successfully");

		// Step 5: Perform Action----->Click
		pagemanagementobj.intitwelcomepage().getFemale().click();
		test.log(Status.INFO, "Step 5 : Click Actions Done Successfully");

		// Step 5a :
		pagemanagementobj.intitwelcomepage().getGoa().click();
		test.log(Status.INFO, "Step 5a : Click Actions Done Successfully");

		// Step 6 :
		Select s1 = new Select(pagemanagementobj.intitwelcomepage().getCountry());
		s1.selectByVisibleText("USA");
		test.log(Status.INFO, "Step 6 : Drop Down Done Successfully");

		// Step 7 :
		pagemanagementobj.intitwelcomepage().getFeedback().sendKeys("Epsomdoms is a best product");
		test.log(Status.INFO, "Step 7 :Feedback Entered Successfully");

		// Step 8 :
		pagemanagementobj.intitwelcomepage().getFile().sendKeys("C:\\Users\\Revathi\\OneDrive\\Documents");
		test.log(Status.INFO, "Step 8 : File Uploaded Succesfully");

		// Step 9 :
		pagemanagementobj.intitwelcomepage().getRegister().click();
		test.log(Status.INFO, "Step 9: Registration Done Successfully");

		
		// See the Execution
		javaUtility.pause(3000);

		// To make the Explicit TestSript fail
		// Assert.fail();

		// Executing the post condition------> Terminate the browser
		test.log(Status.INFO, "Test-2 Execution Completed Successfully..TestPass..Testpass..>");
	}

}
