package com.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	static Properties properties;
	static String value;
	public static String getProperty(String key) throws IOException
	{
	
	try {
        FileReader reader = new FileReader(System.getProperty("user.dir")+"\\Config.properties");
        properties = new Properties();
       properties.load(reader);
     value=properties.getProperty(key);
        reader.close();
        
    } catch (FileNotFoundException e) {
        e.printStackTrace();
       
    }
	return value;		
}
}
	


