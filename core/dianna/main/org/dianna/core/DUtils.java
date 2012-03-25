/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dianna.core;

import com.google.bitcoin.core.Utils;

/**
 * Wrapper to Bitcoin Utils class
 * @author pentarh
 */
public class DUtils extends Utils {

    /**
     * Return truncated string used in toString() objects outputs
     * @param str
     * @param numbytes
     * @return
     */
    public static String strTruncate(String str, int numbytes) {
        if (str.length()<=numbytes) {
            return str;
        }
        return str.substring(0, numbytes-1) + "...";
    }
}
