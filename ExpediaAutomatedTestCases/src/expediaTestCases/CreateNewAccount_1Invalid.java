package expediaTestCases;

import pageObjectModel.CreateNewAccount_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateNewAccount_1Invalid {
		WebDriver driver;
		String baseURL;
		CreateNewAccount_1 createsearch_1;
		
		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anky\\Eclipse WorkSpaces\\Priyanshi\\Selenium drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			baseURL = "https://www.expedia.ca";
			createsearch_1 = new CreateNewAccount_1(driver);	
		}
		
		@Test
		public void test() throws InterruptedException {
			driver.get(baseURL);
			Thread.sleep(3000);
			createsearch_1.clickAccountTab();
			Thread.sleep(3000);
			createsearch_1.clickCreateAccountTab();
			Thread.sleep(3000);
			createsearch_1.setUsernameFirstName("Pari");
			Thread.sleep(3000);
			createsearch_1.setLastNameField("Sak");
			Thread.sleep(3000);
			createsearch_1.setEmailField("priyanshi0611@gmail.com");
			createsearch_1.setPasswordField("aanu19aby89");
			Thread.sleep(3000);
			createsearch_1.setConfirmPasswordField("aanu19aby89");
			Thread.sleep(3000);
			createsearch_1.clickPolicyTab();
			Thread.sleep(3000);
			createsearch_1.clickSubmitTab();
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

	

	

