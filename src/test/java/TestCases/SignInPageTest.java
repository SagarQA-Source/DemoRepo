package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.SignInPage;
import TestBase.BaseClass;

public class SignInPageTest extends BaseClass{

	SignInPage signinPage;
	HomePage homepage;
	
	public SignInPageTest() {
	super();	
}

	@BeforeMethod
	public void setup() {
	initialization();
	displaySignInLink();
	signinPage = new SignInPage();
	
	}
	
	@Test(priority=1)
	public void signInPageTitleTest()
	{
	String title= signinPage.validateSignInPageTitle();
	Assert.assertEquals(title, "Walmart Canada");
	}
	
	@Test(priority=2)
	
	public void signInTest() throws IOException
	{
		homepage= signinPage.signIn(prop.getProperty("email"),prop.getProperty("password"));
		
		//Take Screen Shot
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Sagar\\eclipse-workspace\\Walmart\\test-output\\Screenshots\\login.png"));
	}
	
	
	@AfterMethod
	
	public void aftermethod() {
		driver.quit();		
		
	}
}	