package utility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderExcelData {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "FacebookAccount")
	public void faceBooKLogin(String firstName,String surName,String mobileNum,String newPassword) throws InterruptedException {
		
		WebElement buttonCreateNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		buttonCreateNewAccount.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobileNum);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(newPassword);
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "FacebookAccount")
	public Object[][] getTestData() throws EncryptedDocumentException, IOException {
		
		return Utility.getTestDataforDataProvider("Sheet1");
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.close();
	}
}
