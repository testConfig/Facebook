package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.BaseUtil;

public class LoginPage extends BaseUtil{
	//private BaseUtil base;
	
	public LoginPage(WebDriver Driver) {
		
		PageFactory.initElements(Driver, this);
	}
	
	
	
	@FindBy(how=How.CSS, using="#email")
	WebElement EmailAddress;
	@FindBy(how=How.CSS, using ="#pass")
	WebElement passWord;
	@FindBy(how=How.CSS,using="#u_0_2")
	WebElement LoginButton;
	@FindBy(how=How.XPATH, using="//h2[@class='uiHeaderTitle']")
	WebElement verifyText;
	@FindBy(how=How.XPATH,using="//div[@class='_4rbf _53ij']")
	WebElement verfyPass;
	@FindBy(how=How.XPATH,using="//div[@class='_4rbf _53ij']")
	WebElement wrongUserNameVerify;
	public void logIn(String Email,String Pass) {
		EmailAddress.clear();
		EmailAddress.sendKeys(Email);
		passWord.clear();
		passWord.sendKeys(Pass);
	}
	public void clickOnLogin() {
		LoginButton.click();
	}
	public String verifyLogin() {
		return verifyText.getText();
		
	}
	public String verifyIncorrectPass() {
		return verfyPass.getText();
	}
	public String WorngPassCheck() {
		return wrongUserNameVerify.getText();
	}
	
	
	 

}
