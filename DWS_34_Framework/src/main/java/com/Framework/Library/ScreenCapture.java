package com.Framework.Library;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenCapture extends BaseTest {
	public static String screenCapture() throws IOException{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(screenShot_Path);
		FileHandler.copy(temp, dest);
		return "."+screenShot_Path;
	}
}
