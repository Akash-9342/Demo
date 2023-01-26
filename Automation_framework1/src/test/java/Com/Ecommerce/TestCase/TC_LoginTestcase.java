package Com.Ecommerce.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_Login_Page;

public class TC_LoginTestcase extends Ecommerce_BaseClass {

	@Test
	public void LoginTestCase() throws InterruptedException, IOException {
		
		logger.info("Open ecommerce URL");
		TC_Ecommerce_Login_Page TEL  = new TC_Ecommerce_Login_Page();
		
		logger.info("Enter Email of user");
		TEL.SetUsername(username);
		
		logger.info("Enter Password of user");
		TEL.SetPassword(password);
		
		logger.info("Click on Login Button");
		TEL.ClickButton();
		
		Thread.sleep(3000);
		if(driver.getTitle().equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
		logger.info("Login Successful");
		}
		else {
			getScreenshotAs("LoginTestCase");
			Assert.assertTrue(false);
			logger.info("Login Failed");
		}
	}
}
