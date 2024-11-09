package com.EpsomD.Pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//initiation 
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="name")
	private WebElement nameText;
	

	@FindBy(id="email")
	private WebElement email;

	
	@FindBy(id="password")
	private WebElement password;
	
	
	@FindBy(id="mobile")
	private WebElement mobile;
	
	
	@FindBy(xpath="//input[@type='datetime-local']")
	private WebElement dob;
	
	
	@FindBy(id="female")
	private WebElement female;


	@FindBy(id="goa")
	private WebElement goa;

	
	public WebElement getFeedback() {
		return feedback;
	}


	public WebElement getFile() {
		return file;
	}


	public WebElement getRegister() {
		return register;
	}


	@FindBy(xpath="//select[@name='country1']")
	private WebElement country;
	
	@FindBy(xpath="//textarea[@name='feedback']")
	private WebElement feedback;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement file;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement register;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	private WebElement contactus;
	
	public WebElement getNameText() {
		return nameText;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getDob() {
		return dob;
	}


	public WebElement getFemale() {
		return female;
	}


	public WebElement getGoa() {
		return goa;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getContactuslink() {
		return contactus;
	}


	
}
