package expediaTestCases;

import pageObjectModel.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelTabTest {
		WebDriver driver;
		String baseURL;
		HotelSearchPageFactory hotelsearch;
		

		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anky\\Eclipse WorkSpaces\\Priyanshi\\Selenium drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			baseURL = "https://www.expedia.ca/";
			hotelsearch = new HotelSearchPageFactory(driver);	
		}

		@Test
		public void testHotelBooking() throws InterruptedException {
			driver.get(baseURL);
			hotelsearch.clickHotelsTab();
			hotelsearch.setDestinationCity("Charlevoix, Quebec, Canada");
			hotelsearch.setCheckingDate("23/09/2017");
			hotelsearch.setCheckoutDate("24/09/2017");
			hotelsearch.clickAddFlightTab();
			hotelsearch.setOriginCity("Montreal");
			hotelsearch.clickSearchTab();
		}

		@After
		public void tearDown() throws Exception {
			driver.quit();
		}
}



