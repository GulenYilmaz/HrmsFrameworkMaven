package Homework__Test__Cases;
/*
 * 
 * 
 * from jira
 * 
 * Feature: Login Functionality
Scenario: Login with valid username and invalid password
Given user navigated to HRMS
When user enters valid username 
And user enters invalid password
And clicks on login button
Then user see “Invalid credentials” error message

Scenario:  Login with valid username and without password
Given user navigated to HRMS
When user enters valid username 
And user enters empty password
And clicks on login button
Then user see “Password can not be empty” error message
S
cenario: Login without username and valid password
Given user navigated to HRMS
When user enters empty username 
And valid password
And clicks on login button
Then user see “Username can not be empty” error message
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PredefinedReportPage__JiraHW {
	@FindBy(id = "report_report_name")
	public WebElement reportName;
	@FindBy(id = "report_criteria_list")
	public WebElement selectionCriteria;
	@FindBy(id = "report_include_comparision")
	public WebElement includeCriteria;
	@FindBy(id = "report_display_groups")
	public WebElement displayGroups;
	@FindBy(id = "report_display_field_list")
	public WebElement displayFields;
	@FindBy(id = "btnAddConstraint")
	public WebElement addBTN1;
	@FindBy(id = "btnAddDisplayGroup")
	public WebElement addBTN2;
	@FindBy(id = "btnAddDisplayField")
	public WebElement addBTN3;
	@FindBy(id = "btnSave")
	public WebElement btnSave;
	@FindBy(id = "btnAdd")
	public WebElement btnAdd;
	@FindBy(id = "display_group_2")
	public WebElement displayGrCheckbox2;
	@FindBy(id = "display_group_11")
	public WebElement educationCKB;
	@FindBy(id = "display_group_3")
	public WebElement displayGrCheckbox3;
	@FindBy(id = "display_group_1")
	public WebElement personalCKB;
	@FindBy(xpath = "//table[@id='resultTable']//tbody/tr/td[2]")
	public List<WebElement> tableData;
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr")
	public WebElement ReportsNameRow;
	
	public PredefinedReportPage__JiraHW() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void clickRun(String reportName) {
		boolean flag = false;
		while (!flag) {
			for (int i = 1; i < tableData.size(); i++) {
				String cellData = tableData.get(i - 1).getText();
				if (cellData.equals(reportName)) {
					flag = true;
					BaseClass.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();
					BaseClass.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[3]/a")).click();
					break;
				}
			}
		}
	}}