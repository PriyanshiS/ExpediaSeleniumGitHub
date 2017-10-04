package expediaTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjectModel.*;


public class AllInclusiveVacation {

	WebDriver driver;
	String baseURL;
	AllInclusiveVacationsSearchPageFactory allinclusivevacationssearch;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Applications/Utilities/untitled folder/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.ca/";
		allinclusivevacationssearch = new AllInclusiveVacationsSearchPageFactory(driver);	
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(4000);
		allinclusivevacationssearch.clickAllInclusiveVacationsTab();
		Thread.sleep(2000);
		allinclusivevacationssearch.setLeavingCity("Montreal");;
		Thread.sleep(2000);
		allinclusivevacationssearch.setGoingToCity("All Europe");
		Thread.sleep(2000);
		allinclusivevacationssearch.departingDate.clear();
		allinclusivevacationssearch.setdepartingDate("23/09/2017");
		Thread.sleep(2000);
		allinclusivevacationssearch.setDuration("4");
		Thread.sleep(2000);
		allinclusivevacationssearch.setNoOfAdults("2");
		Thread.sleep(2000);
		allinclusivevacationssearch.clickSearchTab();	
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
}