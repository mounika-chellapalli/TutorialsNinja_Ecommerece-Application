package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	 public WebDriver driver;

	//Constuctor
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	//WebElements
	
	@FindBy(xpath="//a[@href=\"https://tutorialsninja.com/demo/index.php?route=common/home\"]")
	WebElement imgLogo;
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[@href=\"https://tutorialsninja.com/demo/index.php?route=account/register\"]")
	WebElement lnkRegister;
	
	@FindBy(xpath="//div[@id=\"content\"]/h1")
	WebElement verifyHeading;
	
	@FindBy(xpath="//a[@href=\"https://tutorialsninja.com/demo/index.php?route=account/login\"]")
	WebElement lnkLogIn;
	
	//Action methods
	
	public void ClickMyAccount() {
		lnkMyAccount.click();
	}
	
	public void ClickRegister() {
		lnkRegister.click();
	}
	
	public void ClickLogIn() {
		lnkLogIn.click();
	}
	
	public boolean CheckLogo() {
		boolean status = imgLogo.isDisplayed();
		return status;
	}
	
	public boolean CheckHeadLine() {
		boolean status1 = verifyHeading.isDisplayed();
		return status1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
