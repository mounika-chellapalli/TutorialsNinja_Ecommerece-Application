package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public WebDriver driver;
	
	//Constructor
	
	public AccountRegistrationPage(WebDriver driver) {
		
		super(driver);
	}
	
	//WebElements
	
	@FindBy(id="input-firstname")
	WebElement txt_FirstName;
	
	@FindBy(id="input-lastname")
	WebElement txt_LastName;
	
	@FindBy(id="input-email")
	WebElement txt_Email;
	
	@FindBy(id="input-telephone")
	WebElement txt_TelePhone;
	
	@FindBy(id="input-password")
	WebElement txt_Pwd;
	
	@FindBy(id="input-confirm")
	WebElement txt_confPwd;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement btn_policy;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_submit;
	
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement verify_login;
	
	//Action methods
	
	public void setfirstname(String fname) {
		
		txt_FirstName.sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		
		txt_LastName.sendKeys(lname);
	}
	
	public void setEmail(String mailid) {
		
		txt_Email.sendKeys(mailid);
	}
	
	
	public void setTelePhone(String tele) {
		
		txt_TelePhone.sendKeys(tele);
	}
	
	public void setpassword(String pswrd) {

		txt_Pwd.sendKeys(pswrd);
	}
	
	public void setConfirmpassword(String cpswrd) {

		txt_confPwd.sendKeys(cpswrd);
	}
	
	public void ClickpolicyBtn() {

		btn_policy.click();
	}
	
	public void ClickContinueBtn() {

		btn_submit.click();
	}
	
	public String VerifyLogIn() {

		 String result = verify_login.getText();
		 return result;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
