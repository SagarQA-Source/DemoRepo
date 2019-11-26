package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class MyAccountPage extends BaseClass
{
	
	
	@FindBy(id="login-form-email")
     WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id= "account-signin-btn")
     WebElement submitbtn;
	
public MyAccountPage() {
	PageFactory.initElements(driver, this);
}

public HomePage SignInButtonClick()
{
	email.sendKeys("sagarpatel2510@gmail.com");
	password.sendKeys("Test@123");
	submitbtn.click();
	
	return new HomePage();
}}
 