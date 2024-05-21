package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;


	public class TC_003_LoginDDT extends BaseClass{

		HomePage hp;
		LoginPage lp;
		MyAccountPage mypage;
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void verify_LoginDDT(String email, String password, String exp)
		{
			
			logger.info("*** Started TC_003_LoginDDt***");
			
			try
			{
			//homepage
			hp = new HomePage(driver);
			hp.ClickMyAccount();
			hp.ClickLogIn();
			
			
			//Login Page
			
			lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickLogIn();
			
			
			//MyAccount Page
			
			mypage = new MyAccountPage(driver);
			boolean TargetPage = mypage.isMyAccountPageExist();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(TargetPage==true)
				{
					mypage.ClickLogOut();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(TargetPage==true)
				{
					mypage.ClickLogOut();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
			
			}catch(Exception e)
			{
				Assert.fail();
			}
	
			logger.info("*** Ending TC_003_LoginDDT");
			
			
			
		
		
		
		
		
		
		
		
		
		
	}
}