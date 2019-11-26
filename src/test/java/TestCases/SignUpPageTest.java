package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelData.ExcelClass;
import Page.MyAccountPage;
import Page.SignUpPage;
import TestBase.BaseClass;

public class SignUpPageTest extends BaseClass {
	SignUpPage sup; // object of signuppage class
	MyAccountPage myactpage; // object of myaccount page

	public SignUpPageTest() { // constructor method

		super(); // To call methods of Base Class
	}

	@BeforeMethod

	public void setup() {

		initialization();
		displaySignInLink();
		sup = new SignUpPage();
	}

	@Test(priority = 1)
	public void SignUpPageTitleTest() {
		String title = sup.SignUpPageTitle();
		Assert.assertEquals(title, "Walmart Canada");
	}

	// fetching data from excel sheet using apache poi
	@DataProvider
	public Object[][] apachepoi() {
		Object result[][] = ExcelClass.readExcelData("sheet1");
		return result;

	}

	@Test(priority = 2, dataProvider = "apachepoi") // Excel file Name
	public void clickCreateAccountTest(String fname, String lname, String eid, String pw, String cpwd) {

		driver.findElement(By.className("create-account-email")).sendKeys("sagarpatel2510@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Create my account')]")).click();

		myactpage = sup.createMyAccountBtn(fname, lname, eid, pw, cpwd);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
