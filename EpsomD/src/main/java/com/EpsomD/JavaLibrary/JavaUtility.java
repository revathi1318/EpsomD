package com.EpsomD.JavaLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * This Class Provides the Reusable Methods to Perform Java Related Actions 
 * -By calling Inbuilt Methods
 * 
 * @author Revathi
 */
public class JavaUtility {
		
	/**This Method is used to provide Pausing Statement - ThreadSleep
	 * @param long time
	 * @return void*/
	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/***create method for RandomNumber*/
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
	
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
		return sdf.format(date);
	}
}
