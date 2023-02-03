import org.testng.annotations.Test;

public class TestNGDependOnMethods {

	@Test
	public void launchFlipkart() {
		System.out.println("in launch flipkart method");
	}
	
	@Test(dependsOnMethods = "launchFlipkart")
	public void logintoFlipkart() {
		System.out.println("in the login to flipkart method");
	}
	
	@Test(dependsOnMethods = "logintoFlipkart")
	public void addToCart() {
		System.out.println("in add to cart method");
	}

}

