package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchFunctionalityPage;
import pageObjects.ShoppingPage;
import testBase.BaseClass;

public class TC_007_ShoppingCartTest extends BaseClass{

	SearchFunctionalityPage sf;
	ShoppingPage sp;
	
	@Test(groups= {"regression","master"})
	public void verify_ShoppingFunctionality()
	{
		logger.info("*** Starting TC_007_ShoppingCartTest ***");
		
		try
		{
		sf = new SearchFunctionalityPage(driver);
		
		sf.searchField(p.getProperty("product1"));
		logger.info("Entering product name");
		
		sf.searchBtn();
		logger.info("Clicked on searchbutton");
		
		sf.Click_Checkbox();
		logger.info("Clicked on checkBox");
		
		sf.Click_searchbtn2();
		logger.info("Clicked on searchbutton2");
		
		sf.Click_addToCart(); 
		logger.info("Clicked on Add to Cart button");
		
		sp = new ShoppingPage(driver);
		
		logger.info("Validating Expected Message");
		
		sp.Click_Shoppingcart();
		logger.info("Clicked on ShoppingCart Link");
		
		logger.info("Validating Expected productresult");
		String product_name = sp.Verify_ShoppingCart_prod();
		
		if(product_name.equals("iPhone"))
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
