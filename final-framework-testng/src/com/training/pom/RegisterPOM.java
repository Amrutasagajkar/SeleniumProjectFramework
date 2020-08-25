package com.training.pom;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM {
	private WebDriver driver; 

	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class= 'tb_link dropdown tb_menu_system_account_account']")
	private WebElement loginlink;

	@FindBy(xpath="//span[text()='LOGIN / REGISTER']")
	private WebElement login;

	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn; 

	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement Register;

	@FindBy(id="input-firstname")
	private WebElement firstname;

	@FindBy(id="input-lastname")
	private WebElement lastname;

	@FindBy(id="input-email")
	private WebElement email;

	@FindBy(id="input-telephone")
	private WebElement telephone;

	@FindBy(id="input-address-1")
	private WebElement address1;

	@FindBy(id="input-address-2")
	private WebElement address2;

	@FindBy(id="input-city")
	private WebElement city;

	@FindBy(id="input-postcode")
	private WebElement postcode;

	@FindBy(id="input-country")
	private WebElement country;

	@FindBy(id="input-zone")
	private WebElement State;

	@FindBy(id="input-password")
	private WebElement password;

	@FindBy(id="input-confirm")
	private WebElement confirmpassword;

	@FindBy(xpath="//input[@value='0']")
	private WebElement Subscribe;

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue;

	@FindBy(linkText="Forgotten Password")
	private WebElement forgotPwd;

	public void Clickloginlink() {
		Actions act = new Actions(driver);
		act.moveToElement(this.loginlink).build().perform();
	}

	public void login()
	{
		this.login.click();
	}
	public void Register()
	{
		this.Register.click();
	}
	public void Continue()
	{
		this.Continue.click();
	}
	public void sendfirstname(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}

	public void sendlastname(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}

	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	public void sendtelephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}

	public void sendaddress1(String address1) {
		this.address1.clear();
		this.address1.sendKeys(address1);
	}

	public void sendaddress2(String address2) {
		this.address2.clear();
		this.address2.sendKeys(address2);
	}

	public void sendcity(String city) {
		this.city.clear();
		this.city.sendKeys(city);
	}

	public void sendpostcode(String postcode) {
		this.postcode.clear();
		this.postcode.sendKeys(postcode);
	}

	public void sendcountry(String country) {
		Select sel=new Select(this.country);
		sel.selectByVisibleText(country);		

	}

	public void sendstate(String state) {
		Select sel=new Select(this.State);
		sel.selectByVisibleText(state);
	}

	public void sendpassword(String password) {
		this.password.sendKeys(password);
	}

	public void sendconfirmpassword(String confirmpassword) {
		this.confirmpassword.sendKeys(confirmpassword);
	}

	public void sendSubscribe() {
		this.Subscribe.click();
	}

	public void sendcheckbox() {
		this.checkbox.click();;
	}

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void forgotpwd()
	{
		this.forgotPwd.click();
	}

}



