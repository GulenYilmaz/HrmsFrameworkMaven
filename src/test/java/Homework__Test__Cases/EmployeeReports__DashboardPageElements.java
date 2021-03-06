package Homework__Test__Cases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class EmployeeReports__DashboardPageElements extends CommonMethods{
	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(xpath ="//div[@id='branding']/a[1]/img")
	public WebElement logo;
	
	@FindBy(xpath ="//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	
	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	public WebElement reports;
	
	public EmployeeReports__DashboardPageElements() {
		PageFactory.initElements(driver, this);	
	}	
	
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);}
	
 public void navigateToReports() {
	jsClick(PIM);
	jsClick(reports);
	
}}