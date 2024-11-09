package com.EpsomD.Pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManagement {

		public WebDriver driver;
		public LoginPage loginpageobj;
		public RegisterPage registerpageobj;
		public WelcomePage welcomepageobj;
		
		//Initializing
		public PageManagement(WebDriver driver) {
		this.driver=driver;
		}
		public LoginPage initloginpage() {
		loginpageobj=new LoginPage(driver);
			return loginpageobj;
		}
		
		public WelcomePage intitwelcomepage() {
			welcomepageobj= new WelcomePage(driver);
		     return this.welcomepageobj;
	    }
		
		
		public RegisterPage initregisterpage() {
			registerpageobj = new RegisterPage(driver);
			return registerpageobj;
		}
	
	
		
	}
