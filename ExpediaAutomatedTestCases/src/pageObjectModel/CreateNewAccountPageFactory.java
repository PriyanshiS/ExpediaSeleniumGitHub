package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPageFactory {
		public WebDriver driver;
		
		@FindBy (id = "header-account-menu")
	    WebElement accountTab;
		
		@FindBy (id = "account-register")
		WebElement createaccountTab;
		
		@FindBy (id = "create-account-firstname")
		WebElement firstnameField;
		
		@FindBy (id = "create-account-lastname")
		WebElement lastnameField;
		
		@FindBy (id = "create-account-emailId")
		WebElement emailbuttonTab;
		
		@FindBy (id = "create-account-password")
		WebElement passwordbuttonTab;
		
		@FindBy (id = "create-account-confirm-password")
		WebElement confirmpasswordTab;
		
		@FindBy (id = "create-account-expedia-policy")
		WebElement policycheckboxTab;
		
		@FindBy (id = "create-account-submit-button")
		WebElement submitTab;
		
		public CreateNewAccountPageFactory (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void clickAccountTab() {
			accountTab.click();
		}
		
		public void clickCreateAccountTab() {
			createaccountTab.click();
		}
		
		public void setUsernameFirstName(String firstname) {
			firstnameField.sendKeys(firstname);
		}
		
		public void setLastNameField(String lastname) {
			lastnameField.sendKeys(lastname);
		}
		
		public void setEmailField(String emailfield) {
			emailbuttonTab.sendKeys(emailfield);
		}
		
		public void setPasswordField(String passwordfield) {
			passwordbuttonTab.sendKeys(passwordfield);
		}
		
		public void setConfirmPasswordField(String confirmpasswordfield) {
			confirmpasswordTab.sendKeys(confirmpasswordfield);
		}
		
		public void clickPolicyTab() {
			policycheckboxTab.click();
		}
		
		public void clickSubmitTab() {
			submitTab.click();
		}
	
}

