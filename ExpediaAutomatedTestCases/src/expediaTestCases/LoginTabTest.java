package expediaTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjectModel.LoginPageFactory;

public class LoginTabTest {
	WebDriver driver;
	String baseURL;
	LoginPageFactory loginsearch;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Applications/Utilities/untitled folder/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.ca/";
		loginsearch = new LoginPageFactory(driver);	
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
		loginsearch.clickAccountTab();
		Thread.sleep(3000);
		loginsearch.clickSignInTab();
		Thread.sleep(3000);
		loginsearch.setUsernameField("enter a valid username");
		Thread.sleep(3000);
		loginsearch.setPasswordField("enter a valid password");
		Thread.sleep(3000);
		loginsearch.clicksumitButton();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}