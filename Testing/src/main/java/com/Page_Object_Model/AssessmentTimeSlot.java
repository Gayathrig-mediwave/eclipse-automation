package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class AssessmentTimeSlot {
	// initialize web driver
	public WebDriver driver;

	// Xpath for timeslot
	@FindBy(xpath = "(//label[@class='custom-radio'])[1]")
	private WebElement time_slot;

	public WebElement getTime_slot() {
		return time_slot;
	}
	
	// Xpath for confirm
		@FindBy(xpath = "//div[@class='container-xxl container-props']//div[6]")
		private WebElement confirm;

	public WebElement getConfirm() {
			return confirm;
		}

	// Constructor
	public AssessmentTimeSlot(WebDriver dashboard) {
		this.driver = dashboard;
		PageFactory.initElements(driver, this);
	}
}
