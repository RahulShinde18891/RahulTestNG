import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider = "userCredentials")
	public void userLogin(String email,String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		
		WebElement emailTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.id("password"));
		
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		
		driver.close();
		
	}
	
	@DataProvider(name = "userCredentials")
	public Object [][] loginData(){
		return new Object [][] {{"admin","admin@123"},{"projectmanager","projectmanager@123"},{"productowner","productowner"}};
		
	}	
}
