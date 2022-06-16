package com.Framework.Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements FrameworkConstants {
public static WebDriver driver;
@Parameters("browser")
@BeforeTest
public void openChrome(@Optional("chrome") String browserName){
	if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty(Chrome_key, Chrome_Path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	else if(browserName.equalsIgnoreCase("firefox")){
		System.setProperty(Gecko_key, Gecko_Path);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}

@AfterTest
public void closeBrowser(){
	driver.close();
}
}
 