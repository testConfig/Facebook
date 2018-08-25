package steps;

import org.testng.Assert;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class TC001_LoginWithValidCredential extends BaseUtil{
	
	private	BaseUtil base;
	LoginPage Login;
	public TC001_LoginWithValidCredential(BaseUtil base) {
		this.base = base;
		System.out.println("=====b ase  "+this.base);
		
	}
	
	
	
	@Given("^Navigate Through the facebook LoginPage$")
	public void navigate_Through_the_facebook_LoginPage() throws Throwable {
		System.out.print("Driver Name  "+base.Driver);
		base.Driver.get("http://www.faceBook.com");
	  
	}
	@When("^Enter Valid_UserName and Valid_PassWord$")
	public void enter_Valid_UserName_and_Valid_PassWord() throws Throwable {
	  Login=new LoginPage(base.Driver);
	  Login.logIn("seleniumtest420@gmail.com", "Rana0260");
	}

	@When("^Click on Log In Button$")
	public void click_on_Log_In_Button() throws Throwable {
	  Login.clickOnLogin();
	}

	@Then("^User will Sucessfully logIn and Welcome To Facebook will be appear$")
	public void user_will_Sucessfully_logIn_and_Welcome_To_Facebook_will_be_appear() throws Throwable {
	    if(Login.verifyLogin().equals("Welcome to Facebook, Selenium")) {
	    	System.out.print("==== Test is Pass ====");
	    }
	    else
	    {
	    	System.out.print("===== Test is Fail ==== ");
	    }
		Assert.assertEquals(Login.verifyLogin(), "Welcome to Facebook, Selenium");
	}

}
