package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("My Leads | opentaps CRM")) {
			reportStep("This is not Login Page", "FAIL");
		}
	}

	public CreateLeadPage clikCreateLead() {
		clickByLink(prop.getProperty("MyLeads.Lead.Linktext"));
		return new CreateLeadPage(driver, test);

	}

	public FindLeadPage clikFindLead() {
		clickByLink(prop.getProperty("MyLeads.FindLead.Linktext"));
		return new FindLeadPage(driver, test);
	}

	public MergeLeadPage clickMergeLead() {
		clickByLink(prop.getProperty("MyLeads.Merge.Linktext"));
		return new MergeLeadPage(driver, test);
	}
}
