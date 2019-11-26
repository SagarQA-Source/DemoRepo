package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class SignOutPage extends BaseClass {

	@FindBy(id = "header-sign-out")
	WebElement signout;
	
	@FindBy(xpath=("//span[contains(text(),'My account']"))
	WebElement myaccount;

	public SignOutPage() {

		PageFactory.initElements(driver, this);
	}

	public HomePage ClickSignOut() {

		signout.submit();
		return new HomePage();

	}
}
