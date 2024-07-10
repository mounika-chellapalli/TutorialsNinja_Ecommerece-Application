package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPassword_Functionality extends BasePage {

	public WebDriver driver;
	
	//Constructor
	
	public ForgetPassword_Functionality(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElements
	
	@FindBy(xpath="//a[@href=\"https://tutorialsninja.com/demo/index.php?route=account/forgotten\"]")
	WebElement ForgetPswd;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement  Email;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement Btn_Continue;
	
	@FindBy(xpath="//div[contains(@class,'alert')]")
	WebElement ConfirmationMsg;
	
	//Actions
	
	public void click_ForgetPswd()
	{
		ForgetPswd.click();
	}
	
	public void txt_email(String email)
	{
		Email.sendKeys(email);
	}
	
	public void Click_ContinueBtn()
	{
		Btn_Continue.click();
	}
	
	public String getConfirmationMsg()
	{
		try
		{
			return (ConfirmationMsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
