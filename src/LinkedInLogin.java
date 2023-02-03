

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.LinkedInSignInPage;

public class LinkedInLogin {

	@Test
	public void linkedInLoginTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		
		LinkedInSignInPage obj = new LinkedInSignInPage(driver);
		obj.enterEmail("rvshinde12345@gmail.com");
		Thread.sleep(5000);
		obj.enterPassword("password");
		Thread.sleep(5000);
		driver.close();
	}
	
}
