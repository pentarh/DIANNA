/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dianna.core;

import java.io.Serializable;

/**
 *
 * @author pentarh
 */
public class DNetworkParameters implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The protocol version. 10000 means 0.1.00.00.
     */
    public static final int PROTOCOL_VERSION = 10000;

    /**
     * The string returned by getId() for the main, production network where people trade things.
     */
    public static final String ID_PRODNET = "org.dianna.production";

    /**
     * The string returned by getId() for the testnet.
     */
    public static final String ID_TESTNET = "org.dianna.test";
    /** Default TCP port on which to connect to nodes. */
    public int port;
    /** How many blocks pass between price adjustment periods. This is to be 2015. */
    public int intervalBlocks;
    /** How many seconds pass between price adjustment periods. This is to be 1209600 */
    public int intervalSeconds;

}
