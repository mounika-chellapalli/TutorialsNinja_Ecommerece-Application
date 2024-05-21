package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public WebDriver driver;
	
	
	//Constructor
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	//WebElements
	
	@FindBy(id="input-email")
	WebElement txtEmail;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogIn;
	
	public void setEmail(String email) {
		
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogIn() {
		
		btnLogIn.click();
	}
	
}
