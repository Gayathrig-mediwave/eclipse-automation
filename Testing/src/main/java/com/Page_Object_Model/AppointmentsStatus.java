package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class AppointmentsStatus {
	// initialize web driver
	public WebDriver driver;

	// Xpath for rearrange
	@FindBy(xpath = "(//a[normalize-space()='Re-arrange'])[1]")
	private WebElement re_arrange;  

	public WebElement getRe_arrange() {
		return re_arrange;
	}

	// Constructor
	public AppointmentsStatus(WebDriver appointments_Status) {
		this.driver = appointments_Status;
		PageFactory.initElements(driver, this);
	}
}
