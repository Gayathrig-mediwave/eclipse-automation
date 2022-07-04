package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class AppointmentBookedSuccessfully {
	// initialize web driver
	public WebDriver driver;
	// Xpath to go Home
	@FindBy(xpath = "(//a[@id='go-home-link'])[1]")
	private WebElement go_home;

	public WebElement getGo_home() {
		return go_home;
	}

	// Xpath to download appointment
	@FindBy(xpath = "//i[@class='fa fa-download']")
	private WebElement download_appt;

	public WebElement getDownload_app() {
		return download_appt;
	}

	// Xpath to share teams link
	@FindBy(xpath = "(//i[@class='fa fa-clipboard'])[1]")
	private WebElement teams_link;

	public WebElement getTeams_link() {
		return teams_link;
	}

	// Xpath to view appointments
	@FindBy(xpath = "(//a[normalize-space()='View appointments'])[1]")
	private WebElement view_appt;

	public WebElement getView_appt() {
		return view_appt;
	}

	// Constructor
	public AppointmentBookedSuccessfully(WebDriver apptbooked) {
		this.driver = apptbooked;
		PageFactory.initElements(driver, this);
	}
}
