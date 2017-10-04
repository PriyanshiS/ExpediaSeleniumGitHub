package pageObjectModel;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HotelSearchPageFactory {
		WebDriver driver;
		
		@FindBy (id = "tab-hotel-tab-hp")
		WebElement HotelSelectionTab;
		
		@FindBy (id = "hotel-destination-hp-hotel")
		WebElement destinationCity;
		
		@FindBy (id = "hotel-checkin-hp-hotel")
		WebElement checkingDateTab;
		
		@FindBy (id = "hotel-checkout-hp-hotel")
		WebElement checkoutDateTab;
		
		@FindBy (id = "hotel-1-adults-hp-hotel")
		WebElement NoOfAdultsTab;
		
		@FindBy (id = "hotel-add-flight-checkbox-hp-hotel")
		WebElement AddFlightsTab;
		
		@FindBy (id = "hotel-flight-origin-hp-hotel")
		WebElement originCity;
		
		@FindBy (xpath = ".//*[@id='gcw-hotel-form-hp-hotel']/div[9]/label/button")
		WebElement searchTab;
		
		public HotelSearchPageFactory (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void clickHotelsTab() {
			HotelSelectionTab.click();
		}
		
		public void setDestinationCity(String destination) {
			destinationCity.sendKeys(destination);
		}
		
		public void setCheckingDate(String checkingDate) {
			checkingDateTab.sendKeys(checkingDate);
		}
		
		public void setCheckoutDate(String checkOut) {
			checkoutDateTab.sendKeys(checkOut);
		}
		
		public void setNoOfAdults(String adults) {
			NoOfAdultsTab.sendKeys(adults);
		}
		
		public void clickAddFlightTab() {
			AddFlightsTab.click();
		}
		
		public void setOriginCity(String origin) {
			originCity.sendKeys(origin);
		}
		
		public void clickSearchTab() {
			searchTab.click();
		}

}
