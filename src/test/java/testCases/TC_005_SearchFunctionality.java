package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchFunctionalityPage;
import testBase.BaseClass;

public class TC_005_SearchFunctionality extends BaseClass{

	SearchFunctionalityPage sf;
	
	@Test(groups= {"regression","master"})
	public void verify_SearchFunctionality()
	{
		logger.info("*** Starting TC_004_ForgetPassword ***");
		
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
		
		
		/*logger.info("Validating Expected result");
		boolean result = sf.searchResult();
		Assert.assertTrue(result); */
		
		sf.Click_addToCart();
        logger.info("Clicked on Add to Cart button");
		
		}
		catch(Exception e)
		{
		logger.error("Test Failed...");
		Assert.fail();
		}
		logger.info("*** Ended TC_005_SearchFunctionality ***");
	}
}
