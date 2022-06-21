package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class LoginPage {
	// initialize web driver
	public WebDriver driver;
	// Xpath for email address
	@FindBy(xpath = "//input[@id='identifier']")
	private WebElement email_address;

	public WebElement getEmail_address() {
		return email_address;
	}

	// Xpath for password
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	// Xpath for not robot
	@FindBy(xpath = "//label[@class='checkbox']")
	private WebElement not_robot;

	public WebElement getNot_robot() {
		return not_robot;
	}

	// Xpath for enter
	@FindBy(xpath = "//button[@id='loginBtn']")
	private WebElement enter;

	public WebElement getEnter() {
		return enter;
	}

	// Xpath for close dialog mailinator
	@FindBy(xpath = "//div[@id='requestTrial']//button[@aria-label='Close']")
	private WebElement close_dialog;

	public WebElement getClose_dialog() {
		return close_dialog;
	}

	// Xpath for search input
	@FindBy(xpath = "//input[@id='inbox_field']")
	private WebElement search_mail;

	public WebElement getSearch_mail() {
		return search_mail;
	}

	// Xpath for search go
	@FindBy(xpath = "//button[normalize-space()='GO']")
	private WebElement search_go;

	public WebElement getSearch_go() {
		return search_go;
	}

	// Xpath for click code
	@FindBy(xpath = "(//td[@class='ng-binding'][normalize-space()='Xyla login 2FA code'])[1]")
	private WebElement click_code;

	public WebElement getClick_code() {
		return click_code;
	}

	// Xpath for verify code
	@FindBy(xpath = "/html[1]/body[1]/b[1]")
	private WebElement verify_code;

	public WebElement getVerify_code() {
		return verify_code;
	}

	// Xpath for paste otp
	@FindBy(xpath = "(//input[@id='OTP-0'])[1]")
	private WebElement paste_code;

	public WebElement getPaste_code() {
		return paste_code;
	}

	// Xpath for verifying otp
	@FindBy(xpath = "(//button[normalize-space()='Verify'])[1]")
	private WebElement verification;

	public WebElement getVerification() {
		return verification;
	}

	// Constructor
	public LoginPage(WebDriver login) {
		this.driver = login;
		PageFactory.initElements(driver, this);
	}

}
