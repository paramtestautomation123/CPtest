package com.cp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cp.qa.base.TestBase;

public class CreateAccountpage extends TestBase{
	
	@FindBy(xpath ="//input[@id='phoneNumber']")
	WebElement Phone;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement Pwdnum;
	
	@FindBy(xpath ="//input[@id='emailAddress']")
	WebElement Email;
	
	@FindBy(xpath ="//input[@id='mat-checkbox-1-input']")
	WebElement Checkbox;
	
	@FindBy(xpath ="//button[contains(text(),'Create My Account')]")
	WebElement CreateMyAcct;
	
	//Initializing page objects
			public CreateAccountpage() throws IOException {
				
				PageFactory.initElements(driver,this);
			}
			
			public Registrationpage AcctDetails(String phone, String Accpwd, String EmailAdd) throws IOException {
				Phone.sendKeys(phone);
				Pwdnum.sendKeys(Accpwd);
				Email.sendKeys(EmailAdd);
				Checkbox.click();
				 CreateMyAcct.click();
				return new Registrationpage();
							
				
			}

}
