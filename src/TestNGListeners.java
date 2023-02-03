import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(CustomListeners.class)
public class TestNGListeners {


	@Test
	public void test1() {
		System.out.println("In the Test 1");
		assertEquals("rahul", "rahul");
	}
	
	@Test
	public void test2() {
		System.out.println("In the Test 2");
		assertEquals("rahul", "shinde");
	}
	
	@Test
	public void test3() {
		System.out.println("In the Test 3");
		throw new SkipException("this is a skip exception");
	}
	
}
