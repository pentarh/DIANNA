/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dianna.core;

/**
 *
 * @author pentarh
 */
public class DConstants {
    /**
     * Max length of domain. Note: Minimum leght is 1 - hardcoded
     */
    public static final int MAX_DOMAIN_LENGTH=64;

    /**
     * Max length of domain value. Minimum is 1 - hardcoded
     */
    public static final int MAX_VALUE_LENGTH=1024;

    /**
     * Time-to-live for domain and namespace. In Bitcoin blocks count.
     */
    public static final int TTL=52560;

}
