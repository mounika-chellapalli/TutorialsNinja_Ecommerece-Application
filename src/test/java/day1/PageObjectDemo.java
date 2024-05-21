package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectDemo {

	public WebDriver driver;
	
	//constructor
	PageObjectDemo(WebDriver driver){
		
		this.driver = driver;
	}
	
	//Locators
	By img_logo_loc = By.xpath("//img[@alt='company-branding']");
	By txt_username = By.xpath("//input[@name='username']");
	By txt_pswrd = By.xpath("//input[@name='password']");
	By btn_submit = By.xpath("//button[@type='submit']");
	By verfy_login = By.xpath("//span/h6");
	
	//Action methods
	
	public void setUserName(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void setPassword(String password) {
		
		driver.findElement(txt_pswrd).sendKeys(password);
	}
	
	public void clickSubmit() {
		
		driver.findElement(btn_submit).click();
	}
	
	public boolean checkLogoPresence() {
		
		boolean status = driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}
	
	public boolean verfyLogin() {
		boolean stat = driver.findElement(verfy_login).isDisplayed();
		return stat;
	}
	
	
	
	
	
	
}
