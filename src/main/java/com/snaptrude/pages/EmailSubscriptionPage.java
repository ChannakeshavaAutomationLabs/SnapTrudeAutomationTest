/* 
 * @Aauthor: Channakeshava Puttaswamy
 */

package com.snaptrude.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.snaptrude.base.TestBase;

public class EmailSubscriptionPage extends TestBase{

	@FindBy(name="email")
	WebElement emailaddress;

	@FindBy(id="login")
	WebElement subscribeMeButton;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/div/div/div/div/span[2]/h2/strong")
	WebElement loginButton;

	@FindBy(name="clientEmail")
	WebElement clientEmail;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="loginForm")
	WebElement loginForm;
	
	//Initializing the Page Objects:
	public EmailSubscriptionPage(){
		PageFactory.initElements(driver, this);
	}

	public void SubscribeMe(String emailID){
		emailaddress.sendKeys(emailID);
		subscribeMeButton.click();
	}
	
	public void loginSnaptrude(String un, String pwd) {
		clientEmail.sendKeys(un);
		password.sendKeys(pwd);
		loginForm.click();
	}
}

