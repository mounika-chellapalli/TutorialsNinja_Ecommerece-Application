package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFunctionalityPage extends BasePage {

	public WebDriver driver;
	
	public  SearchFunctionalityPage(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElements
	
	@FindBy(xpath="//input[@name='search']")
	WebElement search_Txtfield;
	
	@FindBy(xpath="//button[contains(@class,'btn-default')]")
	WebElement btn_search;
	
	@FindBy(css="/body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1)")
	WebElement prod_result;
	
	@FindBy(css="div[id='content'] div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(2) button:nth-child(1)")
	WebElement btn_AddToCart;
	
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	WebElement txt_confMsg;
	
	@FindBy(xpath="//input[@id='description']")
	WebElement check_box;
	
	@FindBy(xpath="//input[@id='button-search']")
	WebElement btn_search2;
	
	//Action
	public void searchField(String product)
	{
		search_Txtfield.sendKeys(product);
	}
	
	public void searchBtn()
	{
		btn_search.click();
	}
	
	public boolean searchResult()
	{
		return prod_result.isDisplayed();
		 
	}
	
	public void Click_addToCart()
	{
		btn_AddToCart.click();
	}
	
	public String getconfirmationMsg()
	{
		try 
		{
			return (txt_confMsg.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	public void Click_Checkbox()
	{
		check_box.click();
	}
	
	public void Click_searchbtn2()
	{
		btn_search2.click();
	}
	
	
}
