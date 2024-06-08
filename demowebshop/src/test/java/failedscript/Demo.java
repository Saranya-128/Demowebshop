package failedscript;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demowebshop.baseclass.BaseClass;
@Listeners(demowebshop.listnerimplementation.ListnerClass.class)
public class Demo extends BaseClass{
	@Test//(retryAnalyzer = demowebshop.listnerimplementation.RetryListner.class)
	public void demo() {
	Assert.fail();
	Reporter.log(driver.getTitle(),true);
		
	}

}
