package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

//		if(!verifyTitle(" opentaps CRM")){
//			reportStep("This is not opentaps CRM", "FAIL");
//		}
	}

	public EditLeadPage updateCompanyName(String ComanyName) {
		// enterById(prop.getProperty("EditLead.CompanyName.id"), CompanyName);
		enterById("updateLeadForm_companyName", ComanyName);
		return this;
	}

	public EditLeadPage updateFirstName(String FirstName) {
		// enterById(prop.getProperty("CreateLead.FirstName.id"), FirstName);
		enterById("updateLeadForm_firstName", FirstName);
		return this;
	}

	public EditLeadPage updateLastName(String LastName) {
		// enterById(prop.getProperty("CreateLead.FirstName.id"), LastName);
		enterById("updateLeadForm_lastName", LastName);
		return this;
	}

	public ViewLeadPage updateLead() {
		clickByXpath(prop.getProperty("EditLead.UpdateLead.xpath"));
		return new ViewLeadPage(driver, test);
	}

}
