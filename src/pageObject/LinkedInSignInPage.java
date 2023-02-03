package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class LinkedInSignInPage {

	WebDriver driver;
	
	public LinkedInSignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By emailTextField = By.id("username");
	By passwordTextField = By.id("password");
		

	public void enterEmail(String email) {
	driver.findElement(emailTextField).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordTextField).sendKeys(password);
	}

	
	}
	

