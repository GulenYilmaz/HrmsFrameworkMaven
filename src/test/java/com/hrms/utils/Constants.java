package com.hrms.utils;

public class Constants {
	
	
	
		

	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
	
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe";
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\configuration.properties";
	
	public static final String TESTDATA_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\HrmsTestData.xlsx";
	
	public static final int IMPLICIT_WAIT_TIME=15;
	
	public static final int EXPLICIT_WAIT_TIME=30;
	
	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"\\target\\html-report\\HRMS.html";
	
	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"\\screenshot\\";
	
	
	
	
	public static final String OS_NAME=System.getProperty("os.name");
	
	public static final String USER_NAME=System.getProperty("user.name");

	
	
	public static void main(String[] args) {
System.out.println(TESTDATA_FILEPATH);//C:\Users\gulen\eclipse-workspace\HrmsTestNGFramework\src\test\resources\testdata\HrmsTestData.xlsx
System.out.println(OS_NAME);//Windows 10
System.out.println(USER_NAME);//gulen
		
		
	}
}
