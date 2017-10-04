package expediaTestCases;

import pageObjectModel.FlightSearchPageFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	private WebDriver driver;
	private String baseURL;
	private String navigateURL;
	private String currentURL;

	JavascriptExecutor jse;
	FlightSearchPageFactory mouseHoverAction;	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anky\\Eclipse WorkSpaces\\Priyanshi\\Selenium drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.ca/";
		navigateURL = "https://www.expedia.ca/Flights";
		jse = (JavascriptExecutor)driver;
		mouseHoverAction = new FlightSearchPageFactory(driver);
	}
    
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
//		jse.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(2000);
		driver.navigate().to(navigateURL);
		currentURL = driver.getCurrentUrl();
		System.out.println("The current URL is = " + currentURL);
		Thread.sleep(3000);
		driver.navigate().back();
	
		currentURL = driver.getCurrentUrl();
		System.out.println("The current URL is = " + currentURL);
		Thread.sleep(2000);
		driver.navigate().forward();
		currentURL = driver.getCurrentUrl();
		System.out.println("The current URL is = " + currentURL);
		Thread.sleep(2000);
		driver.navigate().back();
		currentURL = driver.getCurrentUrl();
		System.out.println("The current URL is = " + currentURL);
		Thread.sleep(2000);
		
	
		WebElement e1 = driver.findElement(By.id("header-language-3084"));
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}


	

