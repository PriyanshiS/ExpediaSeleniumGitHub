package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearchPageFactory {
	public WebDriver driver;
	
	@FindBy (id = "tab-flight-tab-hp")
    WebElement flightsTab;
	
	@FindBy (id = "flight-type-roundtrip-label-hp-flight")
	WebElement roundTripTab;
	
	@FindBy (id = "flight-origin-hp-flight")
	WebElement originCity;
	
	@FindBy (id = "flight-destination-hp-flight")
	WebElement destinationCity;
	
	@FindBy (id = "flight-departing-hp-flight")
	WebElement departingDateTab;
	
	@FindBy (id = "flight-returning-hp-flight")
	WebElement returningDateTab;
	
	@FindBy (id = "flight-adults-hp-flight")
	WebElement NoOfAdultsTab;
	
	@FindBy (xpath = ".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")
	WebElement searchTab;
	
	@FindBy (id = "2d-footer-form-input")
	public WebElement inputbox;

	public FlightSearchPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		flightsTab.click();
	}
	
	public void clickReturnFlightsTab() {
		roundTripTab.click();
	}
	
	public void clickSearchTab() {
		searchTab.click();
	}
	
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setdepartingDate(String departingDate) {
		departingDateTab.sendKeys(departingDate);
	}

	public void setreturningDate(String returningDate) {
		returningDateTab.sendKeys(returningDate);
	}
	
	public void actionperform() {
		Actions action = new Actions(driver);
		action.moveToElement(inputbox).perform();
	}

}

