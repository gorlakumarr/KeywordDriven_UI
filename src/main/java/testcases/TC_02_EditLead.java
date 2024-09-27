package testcases;

import org.junit.BeforeClass;
import org.junit.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC_02_EditLead {


	public class setdate extends LeafTapsWrappers{

		@BeforeClass
		public void setData() {
			testCaseName="EditLead";
			testDescription="EditLeads";
			browserName="chrome";
			dataSheetName="TC_02_EditLead";
			category="System";
			authors="GKumar";
		}

		@Test(dataProvider="fetchData")
		public void editLead(String userName, String password, String loggedInName,String CompanyName,String FirstName,String LastName){	

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
			.clickTheFirstLead()
			.clickEditLink()
			.updateCompanyName(CompanyName)
			.updateFirstName(FirstName)
			.updateLastName(LastName)
			.updateLead()
			.verifyCompanyName()
			.verifyFirstName()
			.verifyLastName();			
		}
	}
}
