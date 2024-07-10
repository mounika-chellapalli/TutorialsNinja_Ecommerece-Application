package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage{

	public WebDriver driver;
	
	//Constructor
	public ShoppingPage(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElements
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	WebElement lnkShoppingCart;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/p[1]")
	WebElement emptyShoppingCart;
	
	@FindBy(css="body > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)>a")
	WebElement  product_ShoppingCart;
	
	//Action
	
	public void Click_Shoppingcart()
	{
		lnkShoppingCart.click();
	}
	
	public String Verify_EmptyShoppingCart()
	{
		try 
		{
			return (emptyShoppingCart.getText());
		} 
		catch (Exception e) 
		{
			return (e.getMessage());
		}
	}
	
	public String Verify_ShoppingCart_prod()
	{
		try 
		{
			return (product_ShoppingCart.getText());
		} 
		catch (Exception e) 
		{
			return (e.getMessage());
		}
	}
}
