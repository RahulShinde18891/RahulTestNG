import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGHardAssertion {
	
	@Test
	public void testHardAssertion() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		
		WebElement heading = driver.findElement(By.xpath("//h1[@class='header__content__heading ']"));
		WebElement subHeading = driver.findElement(By.xpath("//p[@class='header__content__subheading ']"));
		WebElement logo = driver.findElement(By.xpath("//a[@aria-label='Linkedin']"));
		
		String actualHeading = heading.getText();
		String actualSubHeading = subHeading.getText();
		
		assertEquals(actualHeading, "Sign in");
		System.out.println("After first Assertion");
		
		assertEquals(actualSubHeading, "Stay updated on your professional world");
		assertTrue(logo.isDisplayed());
		
		driver.close();
		
	}

}
