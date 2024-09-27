package testcases;

import org.junit.BeforeClass;
import org.junit.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC_03_DeleteLead {


	public class setdata extends LeafTapsWrappers{

		@BeforeClass
		public void setData() {
			testCaseName="DeleteLead";
			testDescription="DeleteLeads";
			browserName="chrome";
			dataSheetName="TC_03_DeleteLead";
			category="System";
			authors="GKumar";
		}

		@Test(dataProvider="fetchData")
		public void deleteLead(String userName, 
							   String password, 
							   String loggedInName,
							   String CompanyName,
							   String FirstName){	

			new LoginPage(driver, test)
			.enterUserName(userName)
			.enterPassword(password)
			.clickLogin()
			.verifyLoggedName(loggedInName)
			.clickCRMSFA()
			.clickLeads()
			.clikFindLead()
			.enterFirstName(FirstName)
			.clikFindLeadButton()
			.getFirstResultingLead()
			.clickTheFirstLead()
			.clickDeleteLink()
			.clikFindLead()
			.enterLeadID()
			.clikFindLeadButton()
			.verifyErrorMesssge();
		}
	}
}




