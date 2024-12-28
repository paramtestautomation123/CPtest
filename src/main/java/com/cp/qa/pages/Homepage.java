package com.cp.qa.pages;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.cp.qa.pages.Loginpage;
import com.cp.qa.pages.Contactspage;
import org.openqa.selenium.support.PageFactory;

import com.cp.qa.base.TestBase;

public class Homepage extends TestBase{
	
	@FindBy(xpath = "//span[contains(text(),'Groups & Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath="//span[contains(text(),'New Communication')]")
	WebElement NewCommunications;
	
	@FindBy(xpath="//span[contains(text(),'Status & Results')]")
	WebElement Status;
	
	
	
	//Initializing page objects
		public Homepage() throws IOException {
			
			PageFactory.initElements(driver,this);
		}
		
		
		public Contactspage ClickContactslink() {
			Contacts.click();
			return new Contactspage();
		}

		public NewCommunicationpage ClickCommunicationlink() {
			NewCommunications.click();
			return new NewCommunicationpage();
		}
		
		public Statuspage ClickStatuslink() {
			Status.click();
			return new Statuspage();
		}
}
