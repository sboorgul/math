package com.epm.logon.commons;
import com.eaio.uuid.UUID;
public class CommonUtils {
	
	public static String getUniqId() {
		String uniqId = null;
		try{
			UUID uuid = new UUID();
			uniqId = uuid.toString();
		}catch(Exception e){
			System.out.println("Error while generating the uuid ");
			e.printStackTrace();
		}
		return uniqId;
	}
}
