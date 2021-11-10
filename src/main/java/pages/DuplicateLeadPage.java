package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers {
	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Duplicate Lead | opentaps CRM")) {
			reportStep("This is not Home Page", "FAIL");
		}
	}

	public DuplicateLeadPage verifyHeaderDuplicate() {
		verifyTextByXpath(prop.getProperty("DuplicateLead.Header.xpath"), "Duplicate Lead");
		return this;
	}

	public ViewLeadPage clickCreateLeadONDuplicate() {
		clickByXpath(prop.getProperty("DuplicateLead.CreateOnDuplicate.xpath"));
		return new ViewLeadPage(driver, test);
	}

	public DuplicateLeadPage verifyDupplicateName() {
		clickByXpath(prop.getProperty("DuplicateLead.CreateOnDuplicate.class"));
		return this;
	}

}