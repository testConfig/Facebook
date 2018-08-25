package steps;

import org.testng.Assert;

import Base.BaseUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;



public class TC003_LoginWithInValidUserNameAndValidPass extends BaseUtil {
	
	BaseUtil base;
	LoginPage login;
	public TC003_LoginWithInValidUserNameAndValidPass(BaseUtil base) {
		this.base=base;
	}
	
	@When("^Enter Invalid_UserName and Valid_PassWord$")
	public void enter_Invalid_UserName_and_Valid_PassWord() throws Throwable {
		
	    login=new LoginPage(base.Driver);
	    login.logIn("SeleniumTest202@gmail", "Rana0260");
	}

	@Then("^The email you’ve entered doesn’t match any account -appear$")
	public void the_email_you_ve_entered_doesn_t_match_any_account_appear() throws Throwable {
	    if(login.WorngPassCheck().equals("The email you’ve entered doesn’t match any account.")) {
	    	System.out.print("===Test is Pass ===  "+this.getClass().getName());
	    }
	    else{
	    	System.out.print("====Test is Fail ====" + this.getClass().getName());
	    };
	    Assert.assertEquals(login.WorngPassCheck(), "The email or phone number you’ve entered doesn’t Sign up for an account.");
	}

}
