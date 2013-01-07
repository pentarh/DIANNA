/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dianna.tests;

import org.dianna.core.*;
import com.google.bitcoin.core.*;
import org.bouncycastle.util.encoders.Hex;
import java.io.ByteArrayInputStream;


/**
 *
 * @author pentarh
 */
public class Main {


    /** Testing key
     * PRIV: 155c572331fe3de390ff0bf82f1dc340d4fd621fe15e0fa4b8b84b046bc3608f
     * PUB: 04b59a5e7b00699d1e0a546364d54fe3863d32378775c28335ba2c9a8cbdbe2e90f1ffa61564254930e6d2f5be5a0e666b40ee09323d61df429002dc19d91309c5
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create transaction
        byte[] priv=Hex.decode("155c572331fe3de390ff0bf82f1dc340d4fd621fe15e0fa4b8b84b046bc3608f");
        byte[] pub=Hex.decode("04b59a5e7b00699d1e0a546364d54fe3863d32378775c28335ba2c9a8cbdbe2e90f1ffa61564254930e6d2f5be5a0e666b40ee09323d61df429002dc19d91309c5");
        ECKey key=new ECKey(priv,pub);
        byte[] domain="domain.com".getBytes();
        byte[] value="@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;@ IN NS ns1.hosting.com.;".getBytes();
        //Just fake fee trans
        Sha256Hash feeTrans=Sha256Hash.create(new byte[32]);
        // Create "new domain" transaction
        DTransaction tx=new DTransaction(domain,value,feeTrans,null,pub);
        tx.Sign(key);
        byte[] payload=tx.getSerialized();
        System.out.println(tx.toString());
        String serString=DUtils.bytesToHexString(payload);
        System.out.println("SERIALIZED: "+serString);
        System.out.println("SERIALIZED SIZE: "+serString.length());


        //Deserialize transaction
        byte[] ser=Hex.decode(serString);
        DTransaction tx2;
        try {
            tx2=new DTransaction(ser);
        } catch (DProtocolException e) {
            System.out.println("ERROR: "+e.getMessage());
            return;
        }
        System.out.println(tx2.toString());
    }

}
