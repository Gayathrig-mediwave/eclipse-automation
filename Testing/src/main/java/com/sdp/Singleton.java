package com.sdp;
import org.openqa.selenium.WebDriver;
import com.Page_Object_Model.LoginPage;
import com.Page_Object_Model.Register;
import com.Page_Object_Model.XylaMain;
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
	
	// Constuctor for singleton
	public Singleton(WebDriver singleton) {
		this.driver = singleton;
	}
}
