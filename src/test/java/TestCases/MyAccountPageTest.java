package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.MyAccountPage;
import TestBase.BaseClass;

public class MyAccountPageTest extends BaseClass {
	
	
	MyAccountPage myactpage;  // Object of myaccountpage class
	HomePage homePage;

	public MyAccountPageTest()
	{
	super();
	}

	@BeforeMethod
	public void SetUp()
	{
	initialization();
	displaySignInLink();
	myactpage = new MyAccountPage();
	homePage = new HomePage();
	myactpage=new MyAccountPage();
	}

	@Test(priority = 1)
	public void MyAccountPageTitleTest()
	{
	String title=driver.getTitle();
	System.out.println(title);
	}

	@Test(priority = 2)
	public void signInBtnClickTest()
	{
	homePage = myactpage.SignInButtonClick();
	}

	@AfterMethod
	public void afterMethod()
	{
	driver.quit();
	}
	}

