import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter2 {
	
	@Test
	@Parameters({"browser","app"})
	public void setup(String browser,String app) throws InterruptedException {
	
		System.out.println("the browser is :-"+browser );
		
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(app);
			Thread.sleep(3000);
			driver.close();
		}
	}

}
