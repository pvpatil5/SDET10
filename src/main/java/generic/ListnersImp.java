package generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnersImp implements ITestListener
{
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) 
	{
		test=reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, result.getMethod().getMethodName()+ " got passed");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName()+ " got Failed");
		test.log(Status.FAIL, result.getThrowable());
		String path=null;
		try {
		 path= BaseClass.takescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter	reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/SDET10.html");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("FACEbook");

		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Platform", "Windows 11");
		reports.setSystemInfo("Browseer", "Chrome");
		reports.setSystemInfo("Version", "106");
		reports.setSystemInfo("Reporter", "Pavan");


	}

	public void onFinish(ITestContext context) 
	{
		reports.flush();
	}

}
