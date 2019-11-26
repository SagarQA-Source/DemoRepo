package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class SignUpPage extends BaseClass {
	
	// Page Factory- Object Repository
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="confirmPassword")
	WebElement confirmPass;
	
	@FindBy(id="tnc")
	WebElement PolicyChkBox;
	
	@FindBy(id="emailOptIn")
	WebElement subscribechkBox;
	
	@FindBy(id="create-account-btn")
	WebElement createAccountBtn;
	
	// initialize page objects
	
	public SignUpPage() {
		PageFactory.initElements(driver, this); // To call methods of current class only
		
	}
	
	// Actions
	
	public String SignUpPageTitle() {
		return driver.getTitle();
		
	}
	
	public MyAccountPage createMyAccountBtn(String fname,String lname, String eid, String pw, String cpwd)
	{
	 email.sendKeys(eid);
	 //phone.sendKeys(phno);
	 firstname.sendKeys(fname);
	 lastname.sendKeys(lname);
	 password.sendKeys(pw);
	 confirmPass.sendKeys(cpwd);
	 PolicyChkBox.isSelected();
	 createAccountBtn.submit();
	 
	 return new MyAccountPage();  // navigate to MyaccountPage	 
		
		
	}

}
