package Homework__Test__Cases;

import org.testng.annotations.*;

import com.hrms.utils.CommonMethods;

    public class PreDefineReports_UserStory__JiraHW extends CommonMethods {
	
    	
    	
//    	
//    @Test(dataProvider = "setData", groups = "Reports")
//	public void addReports(String reportName, String includeCR, String displayFgroups) {
//		// test.info("Admin logins with valid credentials");
//		login.login();
//		WaitandClick(dashboard.pim);
//		// test.info("Admin navigates to Reports page");
//		WaitandClick(empList.reportsBTN);
//		WaitandClick(reports.btnAdd);
//		// test.info("Admin defines report credentials");
//		sendText(reports.reportName, reportName);
//		selectDDValue(reports.includeCriteria, includeCR);
//		selectDDValue(reports.displayGroups, displayFgroups);
//		for (int i = 0; i < 6; i++) {
//			selectDDValue(reports.displayFields, i);
//			WaitandClick(reports.addBTN3);
//		}
//		wait(2);
//		// test.info("Saving the defined report");
//		WaitandClick(reports.btnSave);
//		wait(3);
//		// test.info("VAlidation by finding new generated report from reports list");
//		reports.clickRun(reportName);
//	}
//
//	@DataProvider
//	public Object[][] setData() {
//		Object[][] data = { { "Personal Details Report", "Current Employees Only", "Personal" },
//				{ "Education Report", "Current and Past Employees", "Education" } };
//		return data;
//	}
}