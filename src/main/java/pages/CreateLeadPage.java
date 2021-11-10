package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This is not Login Page", "FAIL");
		}

	}

	public CreateLeadPage enterCompanyName(String CompanyName) {
		enterById(prop.getProperty("CreateLead.CompanyName.id"), CompanyName);
		return this;
	}

	public CreateLeadPage enterFirstName(String FirstName) {
		enterById(prop.getProperty("CreateLead.FirstName.id"), FirstName);
		return this;
	}

	public CreateLeadPage enterLastName(String LastName) {
		enterById(prop.getProperty("CreateLead.LastName.id"), LastName);
		return this;
	}

	public CreateLeadPage enterFirstNamLocal(String FirstNameLocal) {
		enterById(prop.getProperty("CreateLead.firstNameLocal.id"), FirstNameLocal);
		return this;
	}

	public CreateLeadPage enterLastNameLocal(String LastNameLocal) {
		enterById(prop.getProperty("CreateLead.lastNameLocal.id"), LastNameLocal);
		return this;
	}

	public CreateLeadPage enterpersonalTitle(String personalTitle) {
		enterById(prop.getProperty("CreateLead.personalTitle.id"), personalTitle);
		return this;
	}

	public CreateLeadPage entergeneralProfTitle(String generalProfTitle) {
		enterById(prop.getProperty("CreateLead.generalProfTitle.id"), generalProfTitle);
		return this;
	}

	public CreateLeadPage enterdepartmentName(String departmentName) {
		enterById(prop.getProperty("CreateLead.departmentName.id="), departmentName);
		return this;
	}

	public CreateLeadPage enterannualRevenue(String annualRevenue) {
		enterById(prop.getProperty("CreateLead.annualRevenue.id"), annualRevenue);
		return this;
	}

	public CreateLeadPage entersicCode(String sicCode) {
		enterById(prop.getProperty("CreateLead.sicCode.id"), sicCode);
		return this;
	}

	public CreateLeadPage enternumberEmployees(String numberEmployees) {
		enterById(prop.getProperty("CreateLead.numberEmployees.id"), numberEmployees);
		return this;
	}

	public CreateLeadPage entertickerSymbol(String tickerSymbol) {
		enterById(prop.getProperty("CreateLead.tickerSymbol.id"), tickerSymbol);
		return this;
	}

	public CreateLeadPage enterdescription(String description) {
		enterById(prop.getProperty("CreateLead.description.id"), description);
		return this;
	}

	public CreateLeadPage enterimportantNote(String importantNote) {
		enterById(prop.getProperty("CreateLead.importantNote.id"), importantNote);
		return this;
	}

	public CreateLeadPage enterprimaryPhoneAreaCode(String primaryPhoneAreaCode) {
		enterById(prop.getProperty("CreateLead.primaryPhoneAreaCode.id"), primaryPhoneAreaCode);
		return this;
	}

	public CreateLeadPage enterprimaryPhoneNumber(String primaryPhoneNumber) {
		enterById(prop.getProperty("CreateLead.primaryPhoneNumber.id"), primaryPhoneNumber);
		return this;
	}

	public CreateLeadPage enterprimaryPhoneExtension(String primaryPhoneExtension) {
		enterById(prop.getProperty("CreateLead.primaryPhoneExtension.id"), primaryPhoneExtension);
		return this;
	}

	public CreateLeadPage enterprimaryPhoneAskForName(String primaryPhoneAskForName) {
		enterById(prop.getProperty("CreateLead.primaryPhoneAskForName.id"), primaryPhoneAskForName);
		return this;
	}

	public CreateLeadPage enterprimaryEmail(String primaryEmail) {
		enterById(prop.getProperty("CreateLead.primaryEmail.id"), primaryEmail);
		return this;
	}

	public CreateLeadPage enterdataSourceId() throws InterruptedException {
		selectIndexById(prop.getProperty("CreateLead.dataSourceId.selectindexbyid"), 2);
		Thread.sleep(2000);
		return this;
	}

	public CreateLeadPage entermarketingCampaignId() throws InterruptedException {
		selectIndexById(prop.getProperty("CreateLead.marketingCampaignId.selectIndexById"), 2);
		Thread.sleep(2000);
		return this;
	}

	public CreateLeadPage entercurrencyUomId() throws InterruptedException {
		selectIndexById(prop.getProperty("CreateLead.currencyUomId.selectIndexByValue"), 2);
		Thread.sleep(2000);
		return this;
	}

	public CreateLeadPage enterindustryEnumId(String industryEnumId) throws InterruptedException {
		selectVisibileTextById(prop.getProperty("CreateLead.industryEnumId.selectVisibileTextById"), industryEnumId);
		Thread.sleep(2000);
		return this;
	}

	public CreateLeadPage enterownershipEnumId(String ownershipEnumId) throws InterruptedException {
		selectVisibileTextById(prop.getProperty("CreateLead.createLeadForm_ownershipEnumId.selectVisibileTextById"),
				ownershipEnumId);
		Thread.sleep(2000);
		return this;
	}

	public CreateLeadPage enterprimaryWebUrl(String primaryWebUrl) {
		enterById(prop.getProperty("CreateLead.primaryWebUrl.id"), primaryWebUrl);
		return this;
	}

	public CreateLeadPage entergeneralToName(String generalToName) {
		enterById(prop.getProperty("CreateLead.generalToName.id"), generalToName);
		return this;
	}

	public CreateLeadPage entergeneralAttnName(String generalAttnName) {
		enterById(prop.getProperty("CreateLead.generalAttnName.id"), generalAttnName);
		return this;
	}

	public CreateLeadPage entergeneralAddress1(String generalAddress1) {
		enterById(prop.getProperty("CreateLead.generalAddress1.id"), generalAddress1);
		return this;
	}

	public CreateLeadPage entergeneralAddress2(String generalAddress2) {
		enterById(prop.getProperty("CreateLead.generalAddress2.id"), generalAddress2);
		return this;
	}

	public CreateLeadPage entergeneralCity(String generalCity) {
		enterById(prop.getProperty("CreateLead.generalCity.id"), generalCity);
		return this;
	}

	public CreateLeadPage entergeneralCountryGeoId(String generalCountryGeoId) throws InterruptedException {
		selectVisibileTextById(prop.getProperty("CreateLead.generalCountryGeoId.id"), generalCountryGeoId);
		Thread.sleep(2000);
		return this;
	}

	public CreateLeadPage entergeneralPostalCode(String generalPostalCode) {
		enterById(prop.getProperty("CreateLead.generalPostalCode.id"), generalPostalCode);
		return this;
	}

	public CreateLeadPage entergeneralPostalCodeExt(String generalPostalCodeExt) {
		enterById(prop.getProperty("CreateLead.generalPostalCodeExt.id"), generalPostalCodeExt);
		return this;
	}

	public CreateLeadPage entergeneralStateProvinceGeoId(String generalStateProvinceGeoId) throws InterruptedException {
		selectVisibileTextById(prop.getProperty("CreateLead.generalStateProvinceGeoId.selectVisibileTextById"),
				generalStateProvinceGeoId);
		Thread.sleep(2000);
		return this;
	}

	public ViewLeadPage clickCreateLead() {
		clickByClassName(prop.getProperty("CreateLead.CreateLeadButton.Classs"));
		return new ViewLeadPage(driver, test);
	}

}
