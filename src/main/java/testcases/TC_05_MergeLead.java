package testcases;

import org.junit.BeforeClass;
import org.junit.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC_05_MergeLead {


	public class setdata extends LeafTapsWrappers{

		@BeforeClass
		public void setData() {
			testCaseName="MergeLead";
			testDescription="MergeLeads";
			browserName="chrome";
			dataSheetName="TC_05_MergeLead";
			category="System";
			authors="GKumar";
		}

		@Test(dataProvider="fetchData")
		public void mergeLead(String userName, String password, String loggedInName){	

			new LoginPage(driver, test)
			
			.enterUserName(userName)
			.enterPassword(password)
			.clickLogin()
			.verifyLoggedName(loggedInName)
			.clickCRMSFA()
			.clickLeads()
			.clickMergeLead()
			.clikIMGFrom()
			.clikFindLeadButton()
			.getFirstResultingLead()
			.clickTheFirstLeadMerge()
			.clikIMGTo()
			.clikFindLeadButton()
			.clickTheSecondLeadMerge()
			.clickMergeLeadButton()
			.clikFindLead()
			.enterLeadID()
			.clikFindLeadButton()
			.verifyErrorMesssge();
		
		}

	}

}
