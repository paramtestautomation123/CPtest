package com.cp.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cp.qa.base.TestBase;
import com.cp.qa.pages.Contactspage;
import com.cp.qa.pages.Homepage;
import com.cp.qa.pages.Loginpage;
import com.cp.qa.pages.NewCommunicationpage;
import com.cp.qa.pages.Statuspage;

public class HomepageTest extends TestBase{
	
	Loginpage loginpage;
	Homepage homepage;
	Contactspage contactspage;
	NewCommunicationpage communicationpage;
	Statuspage statuspage;
	
	public HomepageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
    
	@BeforeMethod
	public void setup() throws InterruptedException, IOException  {
		
		initalization();
		
		loginpage = new Loginpage(driver);
		
		homepage= loginpage.Login(prop.getProperty("uid"), prop.getProperty("pwd"));
		
		System.out.println("Login Test");
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void verifyContactspage() throws InterruptedException
	{
		contactspage = homepage.ClickContactslink();
		
        driver.navigate().back();
        System.out.println("Successfully Opens Contact page");
        Thread.sleep(3000);
       // System.out.println("Successfully Opens Contact page");
	}
	@Test(priority=2)
	public void verifyCommunicationspage() throws InterruptedException
	{
		communicationpage = homepage.ClickCommunicationlink();
		Thread.sleep(2000);
        driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Successfully Opens Communications page");
	}
	
	@Test(priority=3)
	
	public void verifystatuspage() throws InterruptedException
	{
		statuspage = homepage.ClickStatuslink();
		
		Thread.sleep(2000);
		
        driver.navigate().back();
		
        Thread.sleep(2000);
        System.out.println("Successfully Opens Status page");
	}
	
	@AfterMethod
	public void close() {
	driver.quit();
	}
}
