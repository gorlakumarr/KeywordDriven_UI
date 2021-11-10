package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC_01_CreateLead {


	public class setDataMethod extends LeafTapsWrappers{

		@BeforeClass
		public void setData() {
			testCaseName="CreateLead";
			testDescription="LeadCreation";
			browserName="chrome";
			dataSheetName="TC_01_CreateLead";
			category="System";
			authors="GKumar";
		}

		@Test(dataProvider="fetchData")
		public void createLead(String userName,
				String password, 
				String loggedInName,
				String CompanyName,
				String FirstName,
				String LastName,
				String FirstNameLocal,
				String LastNameLocal,
				String personalTitle,
				String generalProfTitle,
				String departmentName,
				String annualRevenue,
				String sicCode,
				String numberEmployees,
				String tickerSymbol,
				String description,
				String importantNote,
				String primaryPhoneAreaCode,
				String primaryPhoneNumber,
				String primaryPhoneExtension,
				String primaryPhoneAskForName,
				String primaryEmail,
				String industryEnumId,
				String ownershipEnumId,
				String primaryWebUrl,
				String generalToName,
				String generalAttnName,
				String generalAddress1,
				String generalAddress2,
				String generalCity,
				String generalCountryGeoId,
				String generalPostalCode,
				String generalPostalCodeExt,
				String generalStateProvinceGeoId
				) throws InterruptedException{	
			
			new LoginPage(driver, test)
			.enterUserName(userName)
			.enterPassword(password)
			.clickLogin()
			.verifyLoggedName(loggedInName)
			.clickCRMSFA()
			.clickLeads()
			.clikCreateLead()
			.enterCompanyName(CompanyName).enterFirstName(FirstName).enterLastName(LastName).enterFirstNamLocal(FirstNameLocal).enterLastNameLocal(LastNameLocal).enterpersonalTitle(personalTitle)
			.entergeneralProfTitle(generalProfTitle).enterdepartmentName(departmentName).enterannualRevenue(annualRevenue).entersicCode(sicCode).enternumberEmployees(numberEmployees)
			.entertickerSymbol(tickerSymbol).enterdescription(description).enterimportantNote(importantNote).enterprimaryPhoneAreaCode(primaryPhoneAreaCode).enterprimaryPhoneNumber(primaryPhoneNumber)
			.enterprimaryPhoneExtension(primaryPhoneExtension).enterprimaryPhoneAskForName(primaryPhoneAskForName).enterprimaryEmail(primaryEmail).enterdataSourceId().entermarketingCampaignId()
			.entercurrencyUomId().enterindustryEnumId(industryEnumId).enterownershipEnumId(ownershipEnumId).enterprimaryWebUrl(primaryWebUrl).entergeneralToName(generalToName)
			.entergeneralAttnName(generalAttnName).entergeneralAddress1(generalAddress1).entergeneralAddress2(generalAddress2).entergeneralCity(generalCity).entergeneralCountryGeoId(generalCountryGeoId)
			.entergeneralPostalCode(generalPostalCode).entergeneralPostalCodeExt(generalPostalCodeExt).entergeneralStateProvinceGeoId(generalStateProvinceGeoId)
			
			
			.clickCreateLead()
			.verifyFirstName();

		}

	}

}
