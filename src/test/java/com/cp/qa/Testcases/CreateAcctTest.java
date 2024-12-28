package com.cp.qa.Testcases;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cp.qa.base.TestBase;
import com.cp.qa.pages.CreateAccountpage;
import com.cp.qa.pages.Loginpage;
import com.cp.qa.pages.Registrationpage;

public class CreateAcctTest extends TestBase{
      Loginpage loginpage;
      CreateAccountpage createacctpage;
      Registrationpage registrationpage;
	public CreateAcctTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException  {
		
		initalization();
		
		loginpage = new Loginpage(driver);
		
		 
		loginpage.createacct();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void VerifyAcctdetails() throws IOException, InterruptedException 
	{
		registrationpage = createacctpage.AcctDetails("5036880844","123456","tuser1406@gmail.com");
		 Thread.sleep(3000);
		 //return new Registrationpage();
	}
	
	
	@AfterMethod
	public void close() {
	driver.quit();
	}
}
