package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC_04_DuplicateLead {


	public class setdta extends LeafTapsWrappers{

		@BeforeClass
		public void setData() {
			testCaseName="DuplicateLead";
			testDescription="DuplicateLeads";
			browserName="chrome";
			dataSheetName="TC_04_DuplicateLead";
			category="System";
			authors="GKumar";
		}

		@Test(dataProvider="fetchData")
		public void duplicateLead(String userName, 
				String password,
				String loggedInName,
				String Email
				){	

			new LoginPage(driver, test)
			.enterUserName(userName)
			.enterPassword(password)
			.clickLogin()
			.verifyLoggedName(loggedInName)
			.clickCRMSFA()
			.clickLeads()
			.clikFindLead()
			.clickEmailTab()
			.enterEmail(Email)
			.clikFindLeadButton()
			.getFirstResultingLeadFirstName()
			.clickTheFirstLead()
			.clickDuplicateLink()
			.verifyHeaderDuplicate()
			.clickCreateLeadONDuplicate()
			.verifyDuplicateName()
		;
		}

	}

}
