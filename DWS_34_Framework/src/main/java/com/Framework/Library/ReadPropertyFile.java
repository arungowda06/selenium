package com.Framework.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile implements FrameworkConstants {
	public static String readProp(String key) throws IOException{
		FileInputStream fis=new FileInputStream(property_Path);
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);
	}
}
