package failedscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo2 {
	@Test
	public void demo() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvancedReports/demo.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test=report.createTest("TestName");
		test.log(Status.INFO, "Demo Reports");
		test.log(Status.INFO, "Demo Reports");
		test.log(Status.INFO, "Demo Reports");
		test.log(Status.INFO, "Demo Reports");
		test.log(Status.INFO, "Demo Reports");
		report.flush();
	}

}
