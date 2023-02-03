package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinSignInPage_PF {
	
	WebDriver driver;
 
	public LinkedinSignInPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	@CacheLookup
	private WebElement emailTextField;
	
	@FindBy (id = "password")
	private WebElement passwordTextField;
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	

	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

}
