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
			System.setProperty("webdriver.gecko.driver", "/Applications/Utilities/untitled folder/geckodriver");
			driver = new FirefoxDriver();
			baseURL = "https://www.expedia.ca/";
			hotelsearch = new HotelSearchPageFactory(driver);	
		}

		@Test
		public void test() throws InterruptedException {
			driver.get(baseURL);
			Thread.sleep(3000);
			hotelsearch.clickHotelsTab();
			Thread.sleep(2000);
			hotelsearch.setDestinationCity("Charlevoix, Quebec, Canada");
			//flightsearch.originFlightTab.sendKeys("Montreal");
			hotelsearch.setCheckingDate("23/09/2017");
			Thread.sleep(2000);
			hotelsearch.setCheckoutDate("24/09/2017");
			Thread.sleep(2000);
			hotelsearch.clickAddFlightTab();
			hotelsearch.setOriginCity("Montreal");
			Thread.sleep(2000);
			hotelsearch.clickSearchTab();
			
		}

		@After
		public void tearDown() throws Exception {
			driver.quit();
		}

		
	}



