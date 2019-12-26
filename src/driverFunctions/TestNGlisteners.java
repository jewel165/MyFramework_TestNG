package driverFunctions;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNGlisteners extends TestListenerAdapter {
	
	



		ExtentHtmlReporter htmlReporter;
		ExtentReports report;
		ExtentTest test;


		public void onTestStart(ITestContext cts) {
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/TestReports.html");
			htmlReporter.loadConfig("./extent-config.xml");

			report = new ExtentReports();

			report.setSystemInfo("", "");
			report.setSystemInfo("", "");
			report.setSystemInfo("", "");

			report.attachReporter(htmlReporter);

		}

		public void onTestSuccess(ITestResult result) {
			test=report.createTest(result.getName());// this create a test name in the result 
			test.log(Status.PASS, result.getName()+"TEST CASE Passed");
		}

		public void onTestFailure(ITestResult result) {
			test=report.createTest(result.getName());
			test.log(Status.FAIL, "TEST CASE Failed"+result.getName());
			test.log(Status.FAIL, "TEST CASE Failed"+result.getThrowable());

		}

		public void onTestSkipped(ITestResult ts) {
			test=report.createTest(ts.getName());
			test.log(Status.SKIP, ts.getName()+"Test CASE Skipped");

		}

		public void onFinish(ITestContext clean) {
			report.flush();
		}

	}


