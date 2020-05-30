package com.hrms.utils;

public class Constants {

	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
	
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe";
	
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\configuration.properties";
	
	public static final String EXCELDATA_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\test1.xlsx";
	
	public static final int IMPLICIT_WAIT_TIME=15;
	
	public static final int EXPLICIT_WAIT_TIME=30;
	
	
	public static void main(String[] args) {
		System.out.println(EXCELDATA_FILEPATH);
	}
}