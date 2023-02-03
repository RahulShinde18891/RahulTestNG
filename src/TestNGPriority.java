import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority = 1)
	public void launchFlipkart()
	{
		System.out.println("In the launch Flipkart method");
	}
	
	@Test(priority = 2)
	public void loginToFlipkart()
	{
		System.out.println("In the login to flipkart method");
	}
	
	@Test(priority = 3)
	public void addToCart()
	{
		System.out.println("In add to cart method");
	}
	
}
