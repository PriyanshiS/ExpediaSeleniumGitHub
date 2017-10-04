package pageObjectModel;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AllInclusiveVacationsSearchPageFactory {
		public WebDriver driver;
		
	    @FindBy (id = "tab-threePP-tab-hp")
	    WebElement allInclusiveVacations;
		
        @FindBy (xpath = ".//*[@id='threePP-origin-hp-threePP']/option[30]")
        public WebElement leavingCity;
		
        @FindBy (id = "threePP-destination-hp-threePP")
        WebElement goingToCity;
		
        @FindBy (id = "threePP-departing-date-hp-threePP")
        public WebElement departingDate;
		
		@FindBy (id = "threePP-duration-hp-threePP")
		WebElement durationTime;
	
		@FindBy (id = "threePP-1-adults-hp-threePP")
		WebElement NoOfAdultsTab;

		@FindBy (xpath = ".//*[@id='gcw-threePP-form-hp-threePP']/div[7]/label/button")
		WebElement searchTab;
		
		public AllInclusiveVacationsSearchPageFactory (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void clickAllInclusiveVacationsTab() {
			allInclusiveVacations.click();
		}
		
		public void setLeavingCity(String leavingplace) {
			leavingCity.sendKeys(leavingplace);
		}
		
		public void setGoingToCity(String goingCity) {
			goingToCity.sendKeys(goingCity);
		}
		
		public void setdepartingDate(String departingOn) {
			departingDate.sendKeys(departingOn);
		}

		public void setDuration(String duration) {
			durationTime.sendKeys(duration);
		}
		
		public void setNoOfAdults(String adults) {
			NoOfAdultsTab.sendKeys(adults);
		}

		public void clickSearchTab() {
			searchTab.click();
		}

}



