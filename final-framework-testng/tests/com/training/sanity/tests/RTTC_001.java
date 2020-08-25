package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_001 {

	private WebDriver driver;
	private String baseUrl;
	private RegisterPOM RegisterPOM;
	private static Properties properties;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegisterPOM = new RegisterPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRegisterTest() {
		
		RegisterPOM.Clickloginlink();
		RegisterPOM.login();
		RegisterPOM.Register();
		RegisterPOM.sendfirstname("AmrutaS");
		RegisterPOM.sendlastname("Sagajkar");
		RegisterPOM.sendemail("amrutasagajkar13@gmail.com");
		RegisterPOM.sendtelephone("9876543210");
		RegisterPOM.sendaddress1("yeshwanthapur");
		RegisterPOM.sendaddress2("Hadapsar");
		RegisterPOM.sendcity("Pune");
		RegisterPOM.sendpostcode("411028");
		RegisterPOM.sendcountry("India");
		RegisterPOM.sendstate("Maharashtra");
		RegisterPOM.sendpassword("Test12345");
		RegisterPOM.sendconfirmpassword("Test12345");
		RegisterPOM.sendSubscribe();
		RegisterPOM.sendcheckbox();
		RegisterPOM.Continue();
		
	}

}
