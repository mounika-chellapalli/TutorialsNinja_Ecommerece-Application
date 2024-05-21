package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Tc_001_HomePageAndAccRgistrationTest extends BaseClass {

	HomePage hp;
	AccountRegistrationPage rp;
	
	@Test(groups= {"regression","master"})
	public void verifyingHomePage() 
	{
		logger.info("*** Starting Tc_001_HomePageAndAccRgistrationTest ***");
		
		try
		{
		hp = new HomePage(driver);
	
		hp.CheckLogo();
		Assert.assertEquals(hp.CheckLogo(), true);
		logger.info("Checked Logo presence");
		
		hp.ClickMyAccount();
		logger.info("Clicked On MyAccount Link");
		
		hp.ClickRegister();
		logger.info("Clicked On Registration Link");
		
		hp.CheckHeadLine();
		Assert.assertEquals(hp.CheckHeadLine(), true);
		logger.info("Successfully Opened Registration Page");
	
		//Registratioon Page
		
		logger.info("Entering Customer Details");
		rp  = new AccountRegistrationPage(driver);
		rp.setfirstname(RandomeString().toUpperCase());
		rp.setlastname(RandomeString().toUpperCase());
		rp.setEmail(RandomeString()+"@gmail.com");
		rp.setTelePhone(RandomeNumber());
		
		String password = RandomeAlphaNumeric();
		
		rp.setpassword(password);
		rp.setConfirmpassword(password);
		rp.ClickpolicyBtn();
		rp.ClickContinueBtn();
		logger.info("Clicked On the Continue Button");
		
		logger.info("Validating Expected Message");
		String confmsg = rp.VerifyLogIn();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test Failed");
			Assert.fail();
		}
		               //Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("Test Failed...");
			Assert.fail();
		}
		logger.info("*** Ended Tc_001_HomePageAndAccRgistrationTest ***");
	}	
	
}
