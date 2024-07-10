package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgetPassword_Functionality;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_004_ForgetPassword extends BaseClass{
	
	HomePage hp;
	ForgetPassword_Functionality fpswd;
	
	@Test(groups= {"regression","master"})
	public void verify_forgetpassword_functionality() 
	{
		logger.info("*** Starting TC_004_ForgetPassword ***");

		try
		{
		 hp = new HomePage(driver);
		
		hp.ClickMyAccount();
		logger.info("Clicked on MyAccount Link");
		
		hp.ClickLogIn();
		logger.info("Clicked on Login Link");
		
		fpswd = new ForgetPassword_Functionality(driver);
		
		fpswd.click_ForgetPswd();
		logger.info("Clicked on ForgetPassword Link");
		
		fpswd.txt_email(p.getProperty("Email"));
		logger.info("Entered Email");
		
		fpswd.Click_ContinueBtn();
		logger.info("Clicked on Continue button");
		
		logger.info("Validating Expected Message");
		String confMsg = fpswd.getConfirmationMsg();
		
		if(confMsg.equals("An email with a confirmation link has been sent your email address."))
		{
			logger.info("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test Failed");
			Assert.fail();
		}
				//Assert.assertEquals(confMsg, "An email with a confirmation link has been sent your email address.");
		
		}
		catch(Exception e)
		{
			logger.error("Test Failed...");
			Assert.fail();
		}
		logger.info("*** Ended TC_004_ForgetPassword ***");
	}
}
