package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHome_opentaps_CRMPage extends LeafTapsWrappers {

	public MyHome_opentaps_CRMPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("My Home | opentaps CRM")) {
			reportStep("This is not Login Page", "FAIL");
		}
	}

	public MyLeadsPage clickLeads() {
		clickByLink(prop.getProperty("MyHome_opentaps_CRM.Leads.Linktext"));
		return new MyLeadsPage(driver, test);

	}

}
