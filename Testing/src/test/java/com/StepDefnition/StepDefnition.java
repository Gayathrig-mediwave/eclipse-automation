package com.StepDefnition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.Base_Class;
import com.Runner.Runner;
import com.sdp.Singleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Gayathri Devi G
 *
 */
public class StepDefnition extends Base_Class {
	public static WebDriver driver = Runner.driver;
	public static Singleton sl = new Singleton(driver);

	// Scenario: Sign in
	@Given("^Pass the Url$")
	public void pass_the_Url() throws Throwable {
		geturl("https://staging.acacium.mindwave.site/");
	}

	@When("^scroll down to sign in$")
	public void scroll_down_to_sign_in() throws Throwable {
		jsScrollDownElement(sl.getMain().getSign_in());
	}

	@When("^wait for some seconds$")
	public void wait_for_some_seconds() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^click sign in button$")
	public void click_sign_in_button() throws Throwable {
		clickOnElement(sl.getMain().getSign_in());
	}

	@When("^User inputs the email id$")
	public void user_inputs_the_email_id() throws Throwable {
		Inputvalues(sl.getLogin().getEmail_address(), "madhan@mailinator.com");
	}

	@When("^user enters the password$")
	public void user_enters_the_password() throws Throwable {
		Inputvalues(sl.getLogin().getPassword(), "Admin@123");
	}

	@When("^user clicks not robot$")
	public void user_clicks_not_robot() throws Throwable {
		clickOnElement(sl.getLogin().getNot_robot());
	}

	@When("^user clicks enter$")
	public void user_clicks_enter() throws Throwable {
		clickOnElement(sl.getLogin().getEnter());
	}

	@When("^waits to press ctrl key$")
	public void waits_to_press_ctrl_key() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^user creates a robot class$")
	public void user_creates_a_robot_class() throws Throwable {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);
		rb.delay(1000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_T);
	}

	@When("^user creates a list to switch between tabs to fetch the otp$")
	public void user_creates_a_list_to_switch_between_tabs_to_fetch_the_otp() throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=Julietkandru");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(sl.getLogin().getClose_dialog()));
		clickOnElement(sl.getLogin().getClose_dialog());
		Inputvalues(sl.getLogin().getSearch_mail(), "madhan@mailinator.com");
		clickOnElement(sl.getLogin().getSearch_go());
		Thread.holdsLock(2000);
		clickOnElement(sl.getLogin().getClick_code());
		driver.switchTo().frame("html_msg_body");
		Actions a = new Actions(driver);
		a.doubleClick(sl.getLogin().getVerify_code()).perform();
		driver.switchTo().defaultContent();
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("c");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		driver.switchTo().window(tabs2.get(0));
	}

	@When("^user should paste code using robo class$")
	public void user_should_paste_code_using_robo_class() throws Throwable {
		clickOnElement(sl.getLogin().getPaste_code());
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
	}

	@When("^user allows delay to verify$")
	public void user_allows_delay_to_verify() throws Throwable {
		Thread.sleep(3000);
	}

	@Then("^user clicks verify$")
	public void user_clicks_verify() throws Throwable {
		clickOnElement(sl.getLogin().getVerification());
	}
}
