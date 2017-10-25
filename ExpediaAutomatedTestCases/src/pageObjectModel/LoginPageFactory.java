package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory {
	public WebDriver driver;
	
	@FindBy (id = "header-account-menu")
    WebElement accountTab;
	
	@FindBy (id = "header-account-signin-button")
	WebElement signinTab;
	
	@FindBy (id = "signin-loginid")
	WebElement usernameField;
	
	@FindBy (id = "signin-password")
	WebElement passwordField;
	
	@FindBy (id = "submitButton")
	WebElement sumitButtonTab;
	
	public LoginPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAccountTab() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-account-menu")));
		accountTab.click();
	}
	
	public void clickSignInTab() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-account-signin-button")));
		signinTab.click();
	}
	
	public void setUsernameField(String username) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-loginid")));
		usernameField.sendKeys(username);
	}
	
	public void setPasswordField(String password) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-password")));
		passwordField.sendKeys(password);
	}
	
	public void clicksumitButton() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitButton")));
		sumitButtonTab.click();
	}

}
