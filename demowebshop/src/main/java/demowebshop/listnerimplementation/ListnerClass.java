package demowebshop.listnerimplementation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import demowebshop.baseclass.BaseClass;
import demowebshop.fileutility.JavaUtility;

public class ListnerClass extends BaseClass implements ITestListener,ISuiteListener{
	
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest
	
@Override
public void onStart(ISuite suite) {
	Reporter.log(suite.getName()+"has successfully executed",true);
}
@Override
	public void onTestStart(ITestResult result) {
	Reporter.log(result.getName()+"has successfully executed",true);
	}
@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log(result.getName()+"test script has skipped");
	}
@Override
	public void onTestFailure(ITestResult result) {
	  
	    JavaUtility java=new JavaUtility();
		Reporter.log(result.getName()+" test script has captured successfully");
		//Typecasting
				TakesScreenshot ts=(TakesScreenshot)driver;
				//take Screenshot
				File screenshot=ts.getScreenshotAs(OutputType.FILE);
				//Path
				File path=new File("./FailedTestScripts/"+result.getName()+java.getSystemDate()+".png");
				//Copy
				try {
					FileHandler.copy(screenshot, path);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
