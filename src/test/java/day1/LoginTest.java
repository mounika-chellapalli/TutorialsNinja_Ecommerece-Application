package day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	PageObjClass1 pd;
	
	@BeforeClass
	void setUp() throws InterruptedException {
		
	    driver = new ChromeDriver();
		pd = new PageObjClass1(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
	@Test(priority=1)
	void testLogo() {

		pd.checkLogoPresence();
		//System.out.println(pd.checkLogoPresence());
		Assert.assertEquals(pd.checkLogoPresence(), true);
	}
	
	@Test(priority=2)
	void testLogin() {
		
		
		pd.setUserName("Admin");
		pd.setPassword("admin123");
		pd.clickSubmit();
	}
	
	@Test(priority=3)
	void testVerify() {
		pd.verfyLogin();
		Assert.assertEquals(pd.verfyLogin(), true);
	}
	
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
