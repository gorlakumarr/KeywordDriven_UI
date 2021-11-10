package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("View Lead | opentaps CRM")) {
			reportStep("This is not Home Page", "FAIL");
		}
	}

	public ViewLeadPage verifyCompanyName() {
		verifyTextContainsById(prop.getProperty("ViewLead.CompanyName.id"), "HCLTECH");
		return this;
	}

	public ViewLeadPage verifyFirstName() {
		verifyTextById(prop.getProperty("ViewLead.FirstName.id"), "Kumar");
		return this;
	}

	public ViewLeadPage verifyLastName() {
		verifyTextById(prop.getProperty("ViewLead.LastName.id"), "Gk");
		return this;
	}

	public EditLeadPage clickEditLink() {
		clickByLink(prop.getProperty("ViewLead.EditLink.linktext"));
		return new EditLeadPage(driver, test);
	}

	public MyLeadsPage clickDeleteLink() {
		clickByLink(prop.getProperty("ViewLead.DeleteLink.linktext"));
		return new MyLeadsPage(driver, test);
	}

	public DuplicateLeadPage clickDuplicateLink() {
		clickByLink(prop.getProperty("ViewLead.DuplicateLink.linktext"));
		return new DuplicateLeadPage(driver, test);
	}

	public ViewLeadPage verifyDuplicateName() {
		verifyTextById(prop.getProperty("ViewLead.FirstName.id"), FindLeadPage.FirstResultingLeadName);
		return this;
	}

	public FindLeadPage clikFindLead() {
		clickByLink(prop.getProperty("MyLeads.FindLead.Linktext"));
		return new FindLeadPage(driver, test);
	}

}
