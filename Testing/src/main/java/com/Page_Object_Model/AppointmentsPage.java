package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class AppointmentsPage {
	// initialize web driver
	public WebDriver driver;

	// Xpath for view
	@FindBy(xpath = "(//a[normalize-space()='View'])[1]")
	private WebElement view;

	public WebElement getView() {
		return view;
	}

	// Xpath for rearrange
	@FindBy(xpath = "(//button[@class='btn btn-transparent'][normalize-space()='Re-arrange'])[1]")
	private WebElement re_arrange;  

	public WebElement getRe_arrange() {
		return re_arrange;
	}

	// Constructor
	public AppointmentsPage(WebDriver appointments) {
		this.driver = appointments;
		PageFactory.initElements(driver, this);
	}
}
