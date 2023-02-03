import org.testng.annotations.Test;

public class TestNGGroups {
	
	@Test(groups = "Valid login")
	public void validlogin() {
		System.out.println("in first valid login method");
	}

	@Test(groups = "Invalid login")
	public void invalidLogin() {
		System.out.println("in invalid login method");
	}
	
	@Test(groups = "Valid login")
	public void validLogin2() {
		System.out.println("in valid login2 method");
	}
	
}
