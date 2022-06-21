package com.StepDefnition;
import org.openqa.selenium.WebDriver;

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
	public static WebDriver driver=Runner.driver;
	public static Singleton sl=new Singleton(driver);
		@Given("^Pass the Url$")
		public void pass_the_Url() throws Throwable {
			geturl("https://staging.acacium.mindwave.site/");
		    throw new PendingException();
		}

		@When("^scroll down to sign in$")
		public void scroll_down_to_sign_in() throws Throwable {
			jsScrollDownElement(sl.getMain().getSign_in());
		    throw new PendingException();
		}

		@When("^wait for some seconds$")
		public void wait_for_some_seconds() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^click sign in button$")
		public void click_sign_in_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^User inputs the email id$")
		public void user_inputs_the_email_id() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user enters the password$")
		public void user_enters_the_password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user clicks not robot$")
		public void user_clicks_not_robot() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user clicks enter$")
		public void user_clicks_enter() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user press 'control' key$")
		public void user_press_control_key() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user press 't' key$")
		public void user_press_t_key() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user gives a delay$")
		public void user_gives_a_delay() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user navigates to new tab$")
		public void user_navigates_to_new_tab() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user open mailinator page$")
		public void user_open_mailinator_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^gives a delay for dialog box$")
		public void gives_a_delay_for_dialog_box() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user closes the dialog box$")
		public void user_closes_the_dialog_box() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user enters the mailid$")
		public void user_enters_the_mailid() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user searches the user$")
		public void user_searches_the_user() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user waits to see the code$")
		public void user_waits_to_see_the_code() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user opens the link$")
		public void user_opens_the_link() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user switches into frame (\\d+)$")
		public void user_switches_into_frame(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user double clicks the code$")
		public void user_double_clicks_the_code() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user comes out of the frame$")
		public void user_comes_out_of_the_frame() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user should press 'control' key$")
		public void user_should_press_control_key() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user should press 'c' key$")
		public void user_should_press_c_key() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user comes back to the previous tab$")
		public void user_comes_back_to_the_previous_tab() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user should again press 'control' key$")
		public void user_should_again_press_control_key() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user should press 'v' key$")
		public void user_should_press_v_key() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@When("^user delays to verify$")
		public void user_delays_to_verify() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

		@Then("^click verify$")
		public void click_verify() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}
	}	

