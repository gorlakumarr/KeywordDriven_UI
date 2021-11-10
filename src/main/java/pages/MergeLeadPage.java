package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {

	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Merge Leads | opentaps CRM")) {
			reportStep("This is not Login Page", "FAIL");
		}
	}

	public FindLeadPage clikIMGFrom() {
		clickByXpathNoSnap(prop.getProperty("MergeLead.Img1From.xpath"));
		switchToLastWindow();
		return new FindLeadPage(driver, test);

	}

	public FindLeadPage clikIMGTo() {
		clickByXpathNoSnap(prop.getProperty("MergeLead.Img2To.xpath"));
		switchToLastWindow();
		return new FindLeadPage(driver, test);
	}

	public ViewLeadPage clickMergeLeadButton() {
		clickByLinkNoSnap((prop.getProperty("MergeLead.MergeButton.linktext")));
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
}
