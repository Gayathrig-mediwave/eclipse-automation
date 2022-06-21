package com.Runner;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		geturl("https://staging.acacium.mindwave.site/");
		
		/*
		 * driver.switchTo().newWindow(WindowType.TAB); // Loads Sauce Labs open source
		 * website in the newly opened window
		 * driver.get("https://opensource.saucelabs.com/");
		 */

		// jsScrollDownElement(sl.getMain().getRegister());
		// clickOnElement(sl.getMain().getRegister());
		// WebDriverWait wait=new WebDriverWait(driver, 30);
		// wait.until(ExpectedConditions.elementToBeClickable(sl.getReg().
		// getAcceptcontinue())); clickOnElement(sl.getReg().getAcceptcontinue());

		// **** Sign in ****
		jsScrollDownElement(sl.getMain().getSign_in());
		
		Thread.sleep(3000);
		
		clickOnElement(sl.getMain().getSign_in());

		// **** mail and pwd ****
		Inputvalues(sl.getLogin().getEmail_address(), "lisacrown@mailinator.com");
		
		Inputvalues(sl.getLogin().getPassword(), "Test@123");
		
		clickOnElement(sl.getLogin().getNot_robot());
		clickOnElement(sl.getLogin().getEnter());
		Thread.sleep(2000);
		Robot rb = new Robot();
		// Press control keyboard key
		rb.keyPress(KeyEvent.VK_CONTROL);
		// Press A keyboard key
		rb.keyPress(KeyEvent.VK_T);
		rb.delay(1000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_T);
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
		    
		
		
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "t"));
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		//driver.findElement(By.cssSelector(“body”)).sendKeys(Keys.CONTROL+ “t”);
		//driver.findElement(By.cssSelector("body").sendkeys(Keys.CONTROL+"t"));
		//((IJavaScriptExecutor)driver).ExecuteScript("window.open();");
		//driver.SwitchTo().Window(driver.WindowHandles.Last());
		
//		Actions act = new Actions(driver);
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("a");
//		act.keyUp(Keys.CONTROL);
//		act.perform();
//		System.out.println("ctrl+t");
		
		  driver.get(
		  "https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=Julietkandru"
		  );
		  
		  //driver.navigate().to( "https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=Julietkandru");
		  WebDriverWait wait=new WebDriverWait(driver, 50);
		  wait.until(ExpectedConditions.elementToBeClickable(sl.getLogin().
		  getClose_dialog())); clickOnElement(sl.getLogin().getClose_dialog());
		  
		  Inputvalues(sl.getLogin().getSearch_mail(), "lisacrown@mailinator.com");
		  clickOnElement(sl.getLogin().getSearch_go()); Thread.holdsLock(2000);
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
		  Thread.sleep(1000);
		  System.out.println("verifying ....");
		  clickOnElement(sl.getLogin().getVerification());
		  System.out.println("verified.....");
		 
		
		//driver.navigate().back();
		//driver.navigate().back();
		
		
		
	
		
		//**** two factor vrification ****
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.CONTROL,Keys.t);
		//String new_tab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		//driver.get("https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=Julietkandru");
		//driver.switchTo().window("https://www.mailinator.com/v4/public/inboxes.jsp?trialshow=true&to=Julietkandru");
		//driver.switchTo().newWindow(WindowType.TAB); //open a new blank tab
		

	}
}
