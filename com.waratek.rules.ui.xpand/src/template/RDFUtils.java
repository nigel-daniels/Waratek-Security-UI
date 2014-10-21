/**
 * Copyright 2014 Waratek Ltd.
 */
package template;

/**
 * @author Nigel
 *
 */
public class RDFUtils {

	public static String formatPort(String value) {
		String result = "";
		
		if (value.equals("*")) {
			result = value;}
		else {
			try {
				Integer.valueOf(value);
				result = value;
			}
			catch (NumberFormatException e) {}
		}
		return result;
	}
}
