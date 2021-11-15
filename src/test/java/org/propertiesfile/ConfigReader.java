package org.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	

		String projectpath=System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(
			projectpath+"\\src\\test\\java\\org\\propertiesfile\\config.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
}catch(IOException e) {
		e.printStackTrace();
	}
	}

}

	


