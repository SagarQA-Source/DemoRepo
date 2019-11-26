package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.SignInPage;
import Page.SignOutPage;
import TestBase.BaseClass;

public class SignOutPageTest extends BaseClass {

	SignInPage signinpage;
	HomePage homepage;
	SignOutPage signoutpage;

	public SignOutPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();
		signinpage = new SignInPage();
		homepage = new HomePage();
		signoutpage = new SignOutPage();

	}

	@Test(priority = 1)
	public void SignInTest() {

		displaySignInLink();
		homepage = signinpage.signIn(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority = 2)

	public void SignOutTest() {

		displaySignOutlink();
		homepage = signoutpage.ClickSignOut();
	}

	@AfterMethod

	public void aftermethod() {

		driver.quit();
	}
}