package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ShoppingPage;
import testBase.BaseClass;

public class TC_006_EmptyShoppinCartTest extends BaseClass {

	ShoppingPage sp;
	
	@Test(groups= {"regression","master"})
	public void verify_EmptyShoppingFunctionality()
	{
		logger.info("*** Starting TC_006_EmptyShoppinCartTest ***");
		
		try
		{
		sp = new ShoppingPage(driver);
		
		sp.Click_Shoppingcart();
		logger.info("Clicked on ShoppingCart Link");
		
		logger.info("Validating Expected Message");
		String msg = sp.Verify_EmptyShoppingCart();
	
		if(msg.equals("Your shopping cart is empty!"))
		{
			logger.info("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test Failed");
			Assert.fail();
		}
		
		}
		catch(Exception e)
		{
			logger.error("Test Failed...");
			Assert.fail();
		}
		logger.info("*** Ended TC_006_EmptyShoppinCartTest ***");
	}
}
