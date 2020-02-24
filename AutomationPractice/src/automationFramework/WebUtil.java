package automationFramework;

import java.util.Random;

/**
 * 
 * @author Kavindi Weerakkodi
 * This class is for util
 *
 */
public class WebUtil {
	
	//generate random emails
	public static String randomEmailGenerator() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString().toLowerCase();
        return saltStr + "@gmail.com";

	}

}
