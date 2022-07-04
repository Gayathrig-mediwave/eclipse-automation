package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class DashboardPage {
	// initialize web driver
	public WebDriver driver;
	// Xpath for Book assessment
	@FindBy(xpath = "(//a[normalize-space()='Book assessment'])[1]")
	private WebElement book_assessment;

	public WebElement getBook_assessment() {
		return book_assessment;
	}

	// Xpath for view assessment
	@FindBy(xpath = "(//button[@onclick='toggleCard()'])[1]")
	private WebElement view_assessment;

	public WebElement getView_assessment() {
		return view_assessment;
	}
	
	// Xpath for rearrange
		@FindBy(xpath = "(//button[normalize-space()='Re-arrange'])[1]")
		private WebElement rearrange;

	public WebElement getRearrange() {
			return rearrange;
		}
	
	// Xpath for view appointment
			@FindBy(xpath = "(//a[normalize-space()='View'])[1]")
			private WebElement view_appt;

	public WebElement getView_appt() {
				return view_appt;
			}
	
	// Xpath for view details
				@FindBy(xpath = "(//a[normalize-space()='View details'])[1]")
				private WebElement view_details;
	public WebElement getView_details() {
					return view_details;
				}




	// Constructor
	public DashboardPage(WebDriver dashboard) {
		this.driver = dashboard;
		PageFactory.initElements(driver, this);
	}
}
