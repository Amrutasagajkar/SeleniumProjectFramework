package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement emailaddress; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//li[@class= 'tb_link dropdown tb_menu_system_account_account']")
	private WebElement loginlink;
	
	@FindBy(xpath="//span[text()='LOGIN / REGISTER']")
	private WebElement login;
	
	
	public void sendUserName(String emailaddress) {
		this.emailaddress.clear();
		this.emailaddress.sendKeys(emailaddress);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void Clickloginlink() {
		Actions act = new Actions(driver);
		act.moveToElement(this.loginlink).build().perform();
	}
	
	 public void login()
	 {
		 this.login.click();
	 }
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
}
