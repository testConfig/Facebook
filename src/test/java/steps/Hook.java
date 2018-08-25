package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {
	BaseUtil base;
	
	public Hook(BaseUtil base) {
		this.base = base;
		System.out.print("Hook base  "+this.base);
	}
	
	
	
	@Before
	public void InitializeTheBrowser() {
		System.out.print("chrome Borwser is going too open :   ");
		System.out.println(System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		base.Driver=new ChromeDriver();
		
	}
	@After
	public void closeTheBrowser(Scenario scenario) {
		base.Driver.close();
		  if (scenario.isFailed()) {
	            //Take screenshot logic goes here
	            System.out.println(scenario.getName());
	        }
	}

}
