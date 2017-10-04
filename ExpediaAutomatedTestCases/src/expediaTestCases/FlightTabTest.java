package expediaTestCases;

import pageObjectModel.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * TC_1: To verufy the flight tab details on expedia.ca
 * @author priyanshi
 *
 */
public class FlightTabTest {
	WebDriver driver;
	String baseURL;
	FlightSearchPageFactory flightsearch;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anky\\Eclipse WorkSpaces\\Priyanshi\\Selenium drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.ca/";
		flightsearch = new FlightSearchPageFactory(driver);	
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);
		flightsearch.clickFlightsTab();
		flightsearch.clickReturnFlightsTab();
		//flightsearch.originFlightTab.sendKeys("Montreal");
		flightsearch.setOriginCity("Montreal");
		flightsearch.setDestinationCity("New York");
		flightsearch.setdepartingDate("14/12/2017");
		flightsearch.setreturningDate("02/01/2018");
		flightsearch.clickSearchTab();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
}
