package org.meto.appium.extentreports;

import java.io.IOException;
import org.meto.appium.utils.AppiumUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;

public class Listeners extends AppiumUtils implements ITestListener{
	ExtentTest test;
	ExtentReports extent = ReportTestApp.getReporterObject();
	AndroidDriver driver;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.info("alerts displaying");
		test.pass("user logged info aplication");
//		test.warning("Reset password alerts displaying");
		//test.log(Status.WARNING, "This is event WARNING");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
	//	test.log(Status.WARNING, "This is event WARNING");//nuevo
		try {
			driver = (AndroidDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(), driver), result.getMethod().getMethodName());
		//	result.addScreenCaptureFromPath(imagePath, title);
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	@Override
	public void OnTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void OnStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	
	
	
	
	
	
	
}
