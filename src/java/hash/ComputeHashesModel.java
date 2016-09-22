/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.security.MessageDigest;
import java.security.*;
import java.io.UnsupportedEncodingException;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Jiaming
 */
public class ComputeHashesModel {
    public byte[] getHashValue(String originalString, String hashFunction)   {
        
       
        MessageDigest md = null;
        byte[] result = null;
        try{
            md = MessageDigest.getInstance(hashFunction);
            md.reset(); 
            md.update(originalString.getBytes("UTF-8"));
            result = md.digest();
        
        } catch( UnsupportedEncodingException e ){
            e.printStackTrace();
        } catch( NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    public String base64Parse(byte[] bytes) {
        return DatatypeConverter.printBase64Binary(bytes);
    }
    
    public String hexParse(byte[] bytes ) {
        return DatatypeConverter.printHexBinary(bytes);
    }
}
