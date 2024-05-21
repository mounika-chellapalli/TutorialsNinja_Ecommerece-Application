package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public WebDriver driver;
	
	//Constructor
	public MyAccountPage(WebDriver driver) {
		
		super(driver);
	}
	
	//WebElements
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//div[@class='list-group']/a[text()='Logout']")
	WebElement btnLogOut;
	
	//Action Methods
	
	public boolean isMyAccountPageExist()
	{
		try
		{
			return(msgHeading.isDisplayed());
		}
		catch(Exception e) 
		{
			return(false);
		}
	}
	
	public void ClickLogOut()
	{
		btnLogOut.click();
	}
}
