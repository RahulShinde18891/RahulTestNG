import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener  {
	
	public void onTestStart(ITestResult arg0) {
	System.out.println("The test has been started......."+arg0.getName());	
	}
	
	public void onTestFailure(ITestResult arg0) {
		System.out.println("The test has been failed......."+arg0.getName());	
		}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("The test has been passed......."+arg0.getName());	
		}
	
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("The test has been skipped......."+arg0.getName());	
		}
	
	public void onStart(ITestContext arg) {
		System.out.println("Starts test Execution........"+arg.getName());
	}
	
	public void onFinish(ITestContext arg) {
		System.out.println("Finish test Execution........"+arg.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}
}
