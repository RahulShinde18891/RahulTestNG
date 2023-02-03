import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageFactory.LinkedinSignInPage_PF;

public class LinkedinSignInTest_PF {

	
	@Test
	public void signinTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://linkedin.com/login");
		
		LinkedinSignInPage_PF obj = new LinkedinSignInPage_PF(driver);
		
		obj.enterEmail("rvshinde12345@gmail.com");
		Thread.sleep(3000);
		
		obj.enterPassword("Test@123");
		Thread.sleep(3000);
		
		driver.close();
	}
	
}
