/*
* Utility
* A class provide some method for utility.
* Version information
*
* Date
* 12-Aug-2014
* Copyright notice
* 
* Modification Logs:
* DATE    AUTHOR DESCRIPTION
*  --------------------------------------------------------
*  12-Aug-2014	NguyenPT	Init coding
*/
package com.nixforest.alaproject.util;

/**
 * A class provide some method for utility.
 * @author NguyenPT
 *
 */
public final class Utility {
	 /**
     * Method remove sign in Vietnamese string.
     * @param text String to remove sign
     * @return String after remove sign
     */
    public static String removeSign4VietNameseString(String text) {
        for (int i = 1; i < GlobalVariable.VIETNAMESE_SIGNS.length; i++) {
            for (int j = 0; j < GlobalVariable.VIETNAMESE_SIGNS[i].length(); j++) {
                text = text.replace(GlobalVariable.VIETNAMESE_SIGNS[i].charAt(j),
                		GlobalVariable.VIETNAMESE_SIGNS[0].charAt(i - 1));
            }
        }
        return text;
    }
}
