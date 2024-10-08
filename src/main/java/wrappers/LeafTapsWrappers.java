package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class LeafTapsWrappers extends GenericWrappers {

	public String browserName;
	public String dataSheetName;
	public String FirstResultingLeadName;

	@BeforeSuite
	public void beforeSuite() {
		startResult();
	}

	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}

	@BeforeMethod
	public void beforeMethod() {
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		invokeApp(browserName);
		// invokeApp(browserName, true);
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	@AfterTest
	public void afterTest() {
		unloadObjects();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		endTestcase();
		closeAllBrowsers();
	}

//	@DataProvider(name = "fetchData")
//	public Object[][] getData() {
//		return DataInputProvider.getAllSheetData("./data/" + dataSheetName + ".xlsx");
//	}

}
