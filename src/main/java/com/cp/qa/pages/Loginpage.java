package com.cp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cp.qa.pages.Homepage;
import com.cp.qa.base.TestBase;

public class Loginpage extends TestBase{
	
	
	//page factory/Object Repository
	@FindBy(xpath ="//input[@id='mat-input-0']")
	WebElement Userid;
	
	@FindBy(xpath ="//input[@id='mat-input-1']")
	WebElement Password;
	
	@FindBy(xpath ="//span[contains(text(),'Login')]")
	WebElement Lgnbtn;
	
    @FindBy(xpath ="//a[contains(text(),'Create a FREE Account')]")
    WebElement CreateAcct;

//Initializing page objects
	public Loginpage(WebDriver driver) throws IOException {
		
		PageFactory.initElements(driver,this);
	}
	
	//public String validateLoginPageTitle() {
	//	return driver.getTitle();
	//}
	
	public Homepage Login(String uid,String pwd) throws IOException {
		Userid.sendKeys(uid);
		Password.sendKeys(pwd);
		Lgnbtn.click();
		
		return new Homepage();
	}
	
	public void createacct() {
		CreateAcct.click();
	}

	public String validateLoginPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	}