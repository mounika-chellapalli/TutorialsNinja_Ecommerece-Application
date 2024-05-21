package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjClass1 {

public WebDriver driver;
	
	//constructor
	 PageObjClass1(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//webElements Locators+identification
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement img_logo_loc;
	
	@FindBy(xpath= "//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath= "//input[@name='password']")
	WebElement txt_pswrd;
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement btn_submit;
	
	@FindBy(xpath= "//span/h6")
	WebElement Verify_login;
	
	//Action methods
	
	public void setUserName(String username) {
		
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String password) {
		
		txt_pswrd.sendKeys(password);
	}
	
	public void clickSubmit() {
		
		btn_submit.click();
	}
	
	public boolean checkLogoPresence() {
		
		boolean status = img_logo_loc.isDisplayed();
		return status;
	}
	
	public boolean verfyLogin() {
		boolean stat = Verify_login.isDisplayed();
		return stat;
	}
	
	
	
	
	
	
}


