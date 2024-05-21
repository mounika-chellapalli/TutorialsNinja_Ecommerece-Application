package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LogInTest extends BaseClass{

	HomePage hp;
	LoginPage lp;
	MyAccountPage mypage;

	@Test(groups={"sanity","master"})
	public void LogInTest() {
		
		logger.info("***Starting LogInTest***");
		
		try
		{
		hp = new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("Clicked on MyAccount Link");
		
		hp.ClickLogIn();
		logger.info("Clicked on LogIn Link On HOmePage"); 
		
		//Login Page
		
		lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("Email"));
		logger.info("Entering Email Address");
		
		lp.setPassword(p.getProperty("password"));
		logger.info("Entering Password");
		
		lp.clickLogIn();
		logger.info("Clicked on LogIn Button");
		
		//MyAccount Page
		
		mypage = new MyAccountPage(driver);
		logger.info("verifying msg");
		
		boolean TargetPage = mypage.isMyAccountPageExist();
		
			if(TargetPage==true)
			{
				logger.info("Login Test Passed");
			}
			else
			{
				logger.error("Login test failed");
				Assert.fail();
			}
		
		mypage.ClickLogOut();
		logger.info("clicked on LogOut link");
		
		}
		catch(Exception e)
		{
			logger.error("Test Failed....");
			Assert.fail();
		}
		
		logger.info("Ended TC_002_LogInTest");
		
	}
}
