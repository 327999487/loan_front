package com.cycfc.borrow.common.encryption;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.util.Base64;
public class genkeypair{
	
	public static void main(String[] args)throws Exception{
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(512);
        KeyPair keys;
        keys = keyGen.genKeyPair();
        byte[] publicKey = keys.getPublic().getEncoded();
        byte[] b64pubkey = Base64.getEncoder().encode(publicKey);
        System.out.println("publicKey : \n"+ new String(b64pubkey));
        System.out.println("");

        PrivateKey privatekey = keys.getPrivate();
        
        byte[] b64encodepk = Base64.getEncoder().encode(privatekey.getEncoded());
        System.out.println( "PrivateKey : \n" + new String(b64encodepk) );

	}
}