package com.Runner;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.Base_Class;
import com.sdp.Singleton;

/**
 * @author Gayathri Devi G
 *
 */
public class RunnerClass extends Base_Class {
	// initialize web driver
	public static WebDriver driver = Base_Class.get_Driver();
	// Create object for singleton class
	public static Singleton sl = new Singleton(driver);

	public static void main(String[] args) throws IOException, Throwable {
		/* Sign in */
		geturl("https://staging.acacium.mindwave.site/");
		jsScrollDownElement(sl.getMain().getSign_in());
		Thread.sleep(2000);
		clickOnElement(sl.getMain().getSign_in());
		Inputvalues(sl.getLogin().getEmail_address(), "madhan@mailinator.com");
		Inputvalues(sl.getLogin().getPassword(), "Admin@123");
		clickOnElement(sl.getLogin().getNot_robot());
		clickOnElement(sl.getLogin().getEnter());
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);
		rb.delay(1000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_T);
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
		clickOnElement(sl.getLogin().getPaste_code());
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		System.out.println("verifying ....");
		clickOnElement(sl.getLogin().getVerification());
		System.out.println("verified.....");
		Thread.sleep(5000);
		/* Book Assessment */
		boolean book_assessment = sl.getDashboard().getBook_assessment().isDisplayed();
		System.out.println("...........");
		System.out.println(book_assessment);
		if (book_assessment == true) {
			clickOnElement(sl.getDashboard().getBook_assessment());
			Thread.sleep(2000);
			clickOnElement(sl.getAssessmentCalendar().getYes());
			Thread.sleep(2000);
			clickOnElement(sl.getAssessmentCalendar().getOk());
			Thread.sleep(2000);
		} else {
			clickOnElement(sl.getDashboard().getView_assessment());
			Thread.sleep(1000);
			System.out.println("---------");
			// jsScrollDownElement(sl.getDashboard().getView_appt());
			ScrollDown("window.scrollBy(0,300)");
			System.out.println("-----scroll----");

			Thread.sleep(1000);
			System.out.println("---------");
			clickOnElement(sl.getDashboard().getView_appt());
			System.out.println("----click-----");// -- to view and re-arrange if needed
			jsScrollDownElement(sl.getAppointmentsStatus().getRe_arrange());
			Thread.sleep(1000);
			clickOnElement(sl.getAppointmentsStatus().getRe_arrange());
			Thread.sleep(2000);
			clickOnElement(sl.getAssessmentCalendar().getRearrange_yes());
			// clickOnElement(sl.getDashboard().getRearrange()); -- to directly re-arrange
		}
		Thread.sleep(2000);
		screenshot("month_1.png");
		boolean next_date = sl.getAssessmentCalendar().getNext_date().isEnabled();
		boolean prev_date = sl.getAssessmentCalendar().getPrevious_date().isEnabled();
		if (next_date == true && prev_date == true) {
			clickOnElement(sl.getAssessmentCalendar().getPrevious_date());
			Thread.sleep(2000);
			screenshot("month_2.png");
			clickOnElement(sl.getAssessmentCalendar().getNext_date());
			clickOnElement(sl.getAssessmentCalendar().getNext_date());
			Thread.sleep(2000);
			screenshot("month_3.png");
			clickOnElement(sl.getAssessmentCalendar().getPrevious_date());
			Thread.sleep(2000);
		} else if (prev_date == false) {
			clickOnElement(sl.getAssessmentCalendar().getNext_date());
			Thread.sleep(2000);
			screenshot("month_4.png");
			clickOnElement(sl.getAssessmentCalendar().getNext_date());
			Thread.sleep(2000);
			screenshot("month_5.png");
			Thread.sleep(2000);
			clickOnElement(sl.getAssessmentCalendar().getPrevious_date());
			Thread.sleep(2000);
		} else if (next_date == false) {
			clickOnElement(sl.getAssessmentCalendar().getPrevious_date());
			Thread.sleep(2000);
			screenshot("month_6.png");

		}
		WebElement table = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		List<WebElement> rows = table.findElements(By.xpath("//td[@title='Available']"));
		int max_elements = rows.size();
		if (max_elements > 0) {
			Random random = new Random();
			int randomProduct = random.nextInt(max_elements);
			System.out.println("---------");
			System.out.println(randomProduct);
			System.out.println("---------");
			rows.get(randomProduct).click();
			Thread.sleep(2000);
			screenshot("date.png");
		} else {
			clickOnElement(sl.getAssessmentCalendar().getNext_date());
			System.err.println("No dates available");
		}
		jsScrollDownElement(sl.getAssessmentCalendar().getNext());
		Thread.sleep(2000);
		clickOnElement(sl.getAssessmentCalendar().getNext());
		Thread.sleep(2000);

		WebElement slot_table = driver.findElement(By.xpath("(//div[@id='available-slots-container'])[1]"));
		List<WebElement> slot_rows = slot_table.findElements(By.xpath("//input[@name='time-select-radio']"));
		int max_slots = slot_rows.size();
		if (max_slots > 0) {
			Random rand = new Random();
			int randomSlot = rand.nextInt(max_slots);
			System.out.println("---------");
			System.out.println(randomSlot);
			System.out.println("---------");
			jsScrollDownElement(slot_rows.get(randomSlot));
			slot_rows.get(randomSlot).click();
			screenshot("timeslot.png");
		} else {
			System.err.println("No time slots available");
		}
		jsScrollDownElement(sl.getAssessmentTimeSlot().getConfirm());
		Thread.sleep(2000);
		clickOnElement(sl.getAssessmentTimeSlot().getConfirm());
		screenshot("booked_success1.png");
		Thread.sleep(3000);
		screenshot("booked_success.png");
		Thread.sleep(2000);
		screenshot("booked_success2.png");
		clickOnElement(sl.getAppointmentBookedSuccessfully().getView_appt());
		Thread.sleep(3000);
		System.err.println("1111");
		jsScrollDownElement(sl.getAppointmentsPage().getRe_arrange());
		Thread.sleep(2000);
		System.err.println("22222");
		screenshot("booked_appointments.png");
	}
}
