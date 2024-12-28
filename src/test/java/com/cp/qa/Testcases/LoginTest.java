package com.cp.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cp.qa.base.TestBase;
import com.cp.qa.pages.Homepage;
import com.cp.qa.pages.Loginpage;

public class LoginTest extends TestBase{
	
		
		Loginpage loginpage;
		Homepage homepage;
		
		public LoginTest() throws IOException {
			super();
			// TODO Auto-generated constructor stub
		}

		@BeforeMethod
		public void setup() throws InterruptedException, IOException  {
			
			initalization();
			
			loginpage = new Loginpage(driver);
			
			
		}
		
		
		
		@Test(priority=1)
		
		public void logintest() throws IOException {
			homepage = loginpage.Login(prop.getProperty("uid"), prop.getProperty("pwd"));
		}
		
		 
		@AfterMethod
		public void close() {
		driver.quit();
		}
	}



