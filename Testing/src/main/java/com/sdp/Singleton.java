package com.sdp;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.DashboardPage;
import com.Page_Object_Model.LoginPage;
import com.Page_Object_Model.Register;
import com.Page_Object_Model.XylaMain;
import com.Page_Object_Model.AppointmentBookedSuccessfully;
import com.Page_Object_Model.AssessmentCalendar;
import com.Page_Object_Model.AssessmentTimeSlot;
import com.Page_Object_Model.AppointmentsPage;
import com.Page_Object_Model.AppointmentsStatus;

/**
 * @author Gayathri Devi G
 *
 */
public class Singleton {
	// initialize web driver and all pages
	public WebDriver driver;
	private XylaMain xyla;
	private Register Reg;
	private LoginPage Login;
	private DashboardPage Dashboard;
	private AssessmentCalendar AssessmentCalendar;
	private AssessmentTimeSlot AssessmentTimeSlot;
	private AppointmentBookedSuccessfully AppointmentBookedSuccessfully;
	private AppointmentsPage AppointmentsPage;
	private AppointmentsStatus AppointmentsStatus;

	// create Object for each page
	public XylaMain getMain() {
		xyla = new XylaMain(driver);
		return xyla;
	}

	public Register getReg() {
		Reg = new Register(driver);
		return Reg;
	}

	public LoginPage getLogin() {
		Login = new LoginPage(driver);
		return Login;
	}

	public DashboardPage getDashboard() {
		Dashboard = new DashboardPage(driver);
		return Dashboard;
	}

	public AssessmentCalendar getAssessmentCalendar() {
		AssessmentCalendar = new AssessmentCalendar(driver);
		return AssessmentCalendar;
	}

	public AssessmentTimeSlot getAssessmentTimeSlot() {
		AssessmentTimeSlot = new AssessmentTimeSlot(driver);
		return AssessmentTimeSlot;
	}

	public AppointmentBookedSuccessfully getAppointmentBookedSuccessfully() {
		AppointmentBookedSuccessfully = new AppointmentBookedSuccessfully(driver);
		return AppointmentBookedSuccessfully;
	}

	public AppointmentsPage getAppointmentsPage() {
		AppointmentsPage = new AppointmentsPage(driver);
		return AppointmentsPage;
	}
	public AppointmentsStatus getAppointmentsStatus() {
		AppointmentsStatus = new AppointmentsStatus(driver);
		return AppointmentsStatus;
	}

	// Constuctor for singleton
	public Singleton(WebDriver singleton) {
		this.driver = singleton;
	}
}
