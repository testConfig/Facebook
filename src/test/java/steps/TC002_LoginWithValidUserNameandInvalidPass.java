package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class TC002_LoginWithValidUserNameandInvalidPass extends BaseUtil {
	BaseUtil base;
	LoginPage login;
	public TC002_LoginWithValidUserNameandInvalidPass(BaseUtil base) {
		this.base =base;
	}
	
	@When("^Enter Valid_UserName and InValid_PassWord$")
	public void enter_Valid_UserName_and_InValid_PassWord() throws Throwable {
	    login =new LoginPage(base.Driver);
	    login.logIn("seleniumtest420@gmail.com", "WrongPass");
	}

	@When("^Click on LogIn Button$")
	public void click_on_LogIn_Button() throws Throwable {
		login =new LoginPage(base.Driver);
		login.clickOnLogin();
	   
		
	}

	@Then("^The password you’ve entered is incorrect massage will be -appear$")
	public void the_password_you_ve_entered_is_incorrect_massage_will_be_appear() throws Throwable {
	 if(login.verifyIncorrectPass().equals("The password you’ve entered is incorrect. ")) {
		 System.out.print("The password you’ve entered is incorrect. "+this.getClass().getName());
	 }
	 else {
		 System.out.print("===Test Is Fail====  "+this.getClass().getName());
	 }
	}

}
