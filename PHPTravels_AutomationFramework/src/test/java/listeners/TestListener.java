package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	@Override
    public void onStart(ITestContext context) {
        System.out.println("TEST EXECUTION STARTED: " + context.getName().toUpperCase());
    }

    @Override
    public void onTestStart(ITestResult result) {
        Object[] parameters = result.getParameters();
        if (parameters.length > 0) {
            System.out.println("\nRunning Scenario: " + parameters[0].toString());
        } else {
            System.out.println("\nTest Started: " + result.getName());
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(" STATUS: PASSED");
        System.out.println("-------------------------------------------");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("STATUS: FAILED");
        System.out.println("Error Cause: " + result.getThrowable());
        System.out.println("-------------------------------------------");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("STATUS: SKIPPED");
        System.out.println("-------------------------------------------");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("\nTEST EXECUTION FINISHED: " + context.getName().toUpperCase());
        System.out.println("Total Passed: " + context.getPassedTests().size() 
                           + " | Failed: " + context.getFailedTests().size() 
                           + " | Skipped: " + context.getSkippedTests().size());
    }
	
}
