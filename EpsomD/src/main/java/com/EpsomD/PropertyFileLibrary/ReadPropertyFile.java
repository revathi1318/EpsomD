package com.EpsomD.PropertyFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import com.EpsomD.GenericLibrary.FrameworkConstant;


/**This Class is used to Read the Data from the PropertyFile
 * 
 * 
 * @author Revathi*/
public class ReadPropertyFile implements FrameworkConstant {

	private static final Object Key =null;
	public static FileInputStream fis ;
	public static FileOutputStream fos;
	public static Properties property;
	
	/**This Method is used to Read the Data from the PropertyFile
	 * @param String key
	 * @return String*/
	public static String readData(String key){
		//1.convert the Physical file into Java readable file
		try {
			 fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. create an object for properties file
		property = new Properties();
		//3.load all the keys/Data
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return property.getProperty(key);
		
		
	}
	public static void writeData(String key, String value){
		try {
			 fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2. create an object for properties file
		property = new Properties();
		//3.load all the keys/Data
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4 Write the Data
		property.put(Key, value);
		
		//5Convert Java Readable into physical file 
		 try {
			fos = new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 
		 
		//6 Store the Data
		 try {
			property.store(fos, "Latest key Updated sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
