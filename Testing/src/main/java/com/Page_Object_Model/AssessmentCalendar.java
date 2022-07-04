package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gayathri Devi G
 *
 */
public class AssessmentCalendar {
	// initialize web driver
	public WebDriver driver;
	// Xpath for yes in pop-up
	@FindBy(xpath = "//button[@id='__assessment_yes']")
	private WebElement yes;

	public WebElement getYes() {
		return yes;
	}
	
	// Xpath for rearrange yes in pop-up
	@FindBy(xpath = "//button[@id='__rearrange_yes']")
	private WebElement rearrange_yes;	

	public WebElement getRearrange_yes() {
		return rearrange_yes;
	}

	// Xpath for no in pop-up
	@FindBy(xpath = "//button[@id='__assessment_no']")
	private WebElement no;

	public WebElement getNo() {
		return no;
	}

	// Xpath for ok in pop-up
	@FindBy(xpath = "//button[@id='__assessment_ok']")
	private WebElement ok;

	public WebElement getOk() {
		return ok;
	}

	// Xpath for cancel in pop-up
	@FindBy(xpath = "//a[normalize-space()='Cancel']")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}

	// Xpath for next date
	@FindBy(xpath = "//a[@title='Next']")
	private WebElement next_date;

	public WebElement getNext_date() {
		return next_date;
	}

	

	// Xpath for previous date
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
	private WebElement previous_date;
	public WebElement getPrevious_date() {
		return previous_date;
	}
	
	// Xpath for select_date
		@FindBy(xpath = "//a[normalize-space()='22']")
		private WebElement select_date;

	public WebElement getSelect_date() {
			return select_date;
		}

	// Xpath for cancel in next
	@FindBy(xpath = "//button[normalize-space()='Next']")
	private WebElement next;

	public WebElement getNext() {
		return next;
	}

	// Xpath for cancel in go Home
	@FindBy(xpath = "//a[normalize-space()='Go home']")
	private WebElement go_home;

	public WebElement getGo_home() {
		return go_home;
	}
	

	// Constructor
	public AssessmentCalendar(WebDriver dashboard) {
		this.driver = dashboard;
		PageFactory.initElements(driver, this);
	}
}
