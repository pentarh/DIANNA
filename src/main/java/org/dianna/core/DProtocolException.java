/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dianna.core;

/**
 *
 * @author pentarh
 */
public class DProtocolException extends Exception {

    public DProtocolException(String msg) {
        super(msg);
    }

    public DProtocolException(Exception e) {
        super(e);
    }

    public DProtocolException(String msg, Exception e) {
        super(msg, e);
    }
}
