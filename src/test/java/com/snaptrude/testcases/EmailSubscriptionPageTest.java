/* 
 * @Aauthor: Channakeshava Puttaswamy
 */

package com.snaptrude.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.snaptrude.base.TestBase;
import com.snaptrude.pages.EmailSubscriptionPage;

public class EmailSubscriptionPageTest extends TestBase {
	EmailSubscriptionPage emailSubscription;
	
	public EmailSubscriptionPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		emailSubscription = new EmailSubscriptionPage();
	}
	
	@Test
	public void subscribeMe() {
		emailSubscription.SubscribeMe("test@test.com");
	}
	
	@Test
	public void loginToAccount() {
		emailSubscription.loginSnaptrude(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void closeApplication() {
		driver.quit();
	}
}
