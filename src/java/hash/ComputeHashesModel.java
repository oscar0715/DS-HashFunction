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
            // md is a MessageDigest object that implements the specified digest algorithm.
            md = MessageDigest.getInstance(hashFunction);
            md.reset(); 
            // Updates the digest using the byte array of originalString.
            md.update(originalString.getBytes("UTF-8"));
            // Performs a final update on the digest using the specified array of bytes, then completes the digest computation.
            result = md.digest();
        
        } catch( UnsupportedEncodingException e ){
            e.printStackTrace();
        } catch( NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    /*
    * Converts an array of bytes into a string.
    * Return A string containing a lexical representation of xsd:base64Binary
    */
    public String base64Parse(byte[] bytes) {
        return DatatypeConverter.printBase64Binary(bytes);
    }
    
    /*
    * Converts an array of bytes into a string.
    * Return A string containing a lexical representation of xsd:hexBinary
    */
    public String hexParse(byte[] bytes ) {
        return DatatypeConverter.printHexBinary(bytes);
    }
}
