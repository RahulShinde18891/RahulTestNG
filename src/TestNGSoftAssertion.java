import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertion {
	
	@Test
	public void testSoftAssertion() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		
		WebElement heading = driver.findElement(By.xpath("//h1[@class='header__content__heading ']"));
		WebElement subHeading = driver.findElement(By.xpath("//p[@class='header__content__subheading ']"));
		WebElement logo = driver.findElement(By.xpath("//a[@aria-label='Linkedin']"));
		
		String actualHeading = heading.getText();
		String actualSubHeading = subHeading.getText();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualHeading, "Sign in");
		System.out.println("After first Assertion");
		
		softAssert.assertEquals(actualSubHeading, "Stay updated on your professional world");
		softAssert.assertTrue(logo.isDisplayed());
		softAssert.assertAll();
		
		driver.close();
		
	}


}
