package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_003 {
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
	public void forgotPasswordTest() {
		RegisterPOM.Clickloginlink();
		RegisterPOM.login();
		RegisterPOM.sendemail("amrutasagajkar11@gmail.com");
		RegisterPOM.sendpassword("Test123");
		RegisterPOM.clickLoginBtn();
		
		RegisterPOM.forgotpwd();
		RegisterPOM.sendemail("amrutasagajkar11@gmail.com");
		RegisterPOM.Continue();

}
}
