import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {

	@Test
	@Parameters({"browser","app"})
	public void setup(String browser,String app) throws InterruptedException {
		System.out.println("parameter value ="+ browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get(app);
			Thread.sleep(5000);
			driver.close();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get(app);
			Thread.sleep(5000);
			driver.close();
		}
	
	}
	
	
}
