package expediaTestCases;

import pageObjectModel.CreateNewAccountPageFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateNewAccountTabTest {
	WebDriver driver;
	String baseURL;
	CreateNewAccountPageFactory createsearch;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anky\\Eclipse WorkSpaces\\Priyanshi\\Selenium drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.ca";
		createsearch = new CreateNewAccountPageFactory(driver);	
	}
	
	@Test
	public void validCredentialstest() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
		createsearch.clickAccountTab();
		Thread.sleep(3000);
		createsearch.clickCreateAccountTab();
		Thread.sleep(3000);
		createsearch.setUsernameFirstName("Par");
		Thread.sleep(3000);
		createsearch.setLastNameField("Sak");
		Thread.sleep(3000);
		createsearch.setEmailField("pari_sxn@outlook.com");
		createsearch.setPasswordField("test123");
		Thread.sleep(3000);
		createsearch.setConfirmPasswordField("test123");
		Thread.sleep(3000);
		createsearch.clickPolicyTab();
		Thread.sleep(3000);
		createsearch.clickSubmitTab();
		Thread.sleep(3000);	
	}
	@Test
	public void invalidCredentialstest() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(3000);
		createsearch.clickAccountTab();
		Thread.sleep(3000);
		createsearch.clickCreateAccountTab();
		Thread.sleep(3000);
		createsearch.setUsernameFirstName("Pari");
		Thread.sleep(3000);
		createsearch.setLastNameField("Sak");
		Thread.sleep(3000);
		createsearch.setEmailField("priyanshi0611@gmail.com");
		createsearch.setPasswordField("aanu19aby89");
		Thread.sleep(3000);
		createsearch.setConfirmPasswordField("aanu19aby89");
		Thread.sleep(3000);
		createsearch.clickPolicyTab();
		Thread.sleep(3000);
		createsearch.clickSubmitTab();
		Thread.sleep(3000);	
		WebElement e1 = driver.findElement(By.id("alert-acount-already-exist"));
		System.out.println("Is the element present? " + e1.isEnabled());
		Thread.sleep(3000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
