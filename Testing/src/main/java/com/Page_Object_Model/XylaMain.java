package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class XylaMain {
	// initialize web driver
	public WebDriver driver;
	// Xpath for Register
	@FindBy(xpath = "//a[@href='/users/signup']")
	private WebElement register;

	public WebElement getRegister() {
		return register;
	}

	// Xpath for signin
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	private WebElement sign_in;

	public WebElement getSign_in() {
		return sign_in;
	}

	// Constructor
	public XylaMain(WebDriver XylaMain) {
		this.driver = XylaMain;
		PageFactory.initElements(driver, this);
	}
}
