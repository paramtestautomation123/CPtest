package com.cp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.cp.qa.util.*;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {

		try {
	prop = new Properties();
	 FileInputStream ip = new FileInputStream("C:\\Selenium\\SeleniumScripts\\CPTest\\src\\main\\java\\com\\cp\\qa\\config\\Config.properties");
			 
	 prop.load(ip);
		}catch (FileNotFoundException e) {
			
			 e.printStackTrace();
			 
		}catch (IOException e) {
			
			e.printStackTrace();
		}

}
	
	
	public static void initalization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver.exe");
		    driver= new ChromeDriver();
		}
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url"));
		 Thread.sleep(2000);
}
	
}