package Homework__Test__Cases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class EmployeeReportsTest extends CommonMethods {
	
	
	@Test(dataProvider="getDataExcel")
	
	
	
	public void DefiningReport(String reportName, String selection, String selected, String fieldgroup, String displayfields) {
		//test.info("Entering Valid Admin credentials");
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		//test.info("navigating to reports");
		dashboard.navigateToReports();
		//test.info("defining 3 reports");
		empReports.addrE.click();
		empReports.reportName.sendKeys(reportName);
		empReports.selectioncriteria.sendKeys(selection);
		wait(3);
		Select select = new Select (empReports.selectedcriteriainclude);
	    select.selectByVisibleText(selected);
		
		//reports.selectDdValue(reports.selectedcriteriainclude, "Current and Past Employees");
	    empReports.displayFGroups.sendKeys(fieldgroup);
	    empReports.displayFields.sendKeys(displayfields);
	    empReports.addDisplayField.click();
	    empReports.btnsave.click();
	}
	@DataProvider
	public Object[][] getDataExcel() {
		return ExcelUtility.excelIntoArray(Constants.TESTDATA_FILEPATH, "Sheet5");
	}
}