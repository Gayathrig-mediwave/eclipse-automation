package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class Register {
	// initialize web driver
	public WebDriver driver;
	// Xpath for accept and continue
	@FindBy(xpath = "//button[text()='Accept and continue']")
	private WebElement acceptcontinue;

	public WebElement getAcceptcontinue() {
		return acceptcontinue;
	}

	// Constructor
	public Register(WebDriver Reg) {
		this.driver = Reg;
		PageFactory.initElements(driver, this);
	}
}
