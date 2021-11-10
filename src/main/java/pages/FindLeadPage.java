package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {
	public static String FirstResultingLeadName = "";
	public static String FirstResultingLead = "";

	public FindLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Find Leads | opentaps CRM") && !verifyTitle("Find Leads")) {
			reportStep("This is not Login Page", "FAIL");
		}

	}

	public FindLeadPage enterFirstName(String FirstName) {
		enterByXpath(prop.getProperty("FindLead.FirstName.xpath"), FirstName);
		return this;
	}

	public FindLeadPage enterLeadID() {
		enterByXpath(prop.getProperty("FindLead.EnterLeadID.xpath"), FirstResultingLead);
		return this;
	}

	public FindLeadPage verifyErrorMesssge() {
		verifyTextByXpath("//div[text()='No records to display']", "No records to display");
		return this;
	}

	public FindLeadPage clikFindLeadButton() {
		clickByXpathNoSnap(prop.getProperty("FindLead.FindLeads.xpath"));
		return this;
	}

	public FindLeadPage getFirstResultingLead() {
		FirstResultingLead = getTextByXpath(prop.getProperty("FindLead.FirstResultingLead.xpath"));
		return this;
	}

	public FindLeadPage getFirstResultingLeadFirstName() {
		FirstResultingLeadName = getTextByXpath(
				prop.getProperty("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		return this;

	}

	public ViewLeadPage clickTheFirstLead() {
		clickByXpath(prop.getProperty("FindLead.FirstResultingLead.xpath"));
		return new ViewLeadPage(driver, test);
	}

	public MergeLeadPage clickTheFirstLeadMerge() {
		clickByXpathNoSnap(prop.getProperty("FindLead.FirstResultingLead.xpath"));
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}

	public MergeLeadPage clickTheSecondLeadMerge() {
		clickByXpathNoSnap(prop.getProperty("FindLead.SecondResultingLead.xpath"));
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}

	public FindLeadPage clickPhoneTab() {
		clickByLink(prop.getProperty("FindLead.PhoneTab.link"));
		return this;
	}

	public FindLeadPage enterPhoneNumber(String PhoneNumber) {
		enterByName(prop.getProperty("FindLead.PhoneNumber.name"), PhoneNumber);
		return this;
	}

	public FindLeadPage clickEmailTab() {
		clickByXpath(prop.getProperty("FindLead.EMailTab.xpath"));
		return this;
	}

	public FindLeadPage enterEmail(String Email) {
		enterByName(prop.getProperty("FindLead.EMail.name"), Email);
		return this;
	}
}