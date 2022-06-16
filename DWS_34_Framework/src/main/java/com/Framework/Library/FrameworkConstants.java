package com.Framework.Library;

import java.time.LocalDateTime;

public interface FrameworkConstants {
	
	LocalDateTime sysDate=LocalDateTime.now();
	String name= sysDate.toString().replaceAll(":", "-");
	
	String Chrome_Path="./src/main/resources/Drivers/chromedriver.exe";
	String Chrome_key="webdriver.chrome.driver";
	
	String Gecko_Path="./src/main/resources/Drivers/geckodriver.exe";
	String Gecko_key="webdriver.gecko.driver";
	
	String excel_Path="./src/test/resources/TestData/TestData.xlsx";
	
	String property_Path="./src/test/resources/PropertyFile/config.properties";
	
	String screenShot_Path="./Screenshots/"+name+".png";

}
