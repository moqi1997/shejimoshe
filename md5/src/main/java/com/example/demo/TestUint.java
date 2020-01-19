package com.example.demo;

import org.springframework.util.Base64Utils;

import javax.crypto.Cipher;
import java.security.*;

public class TestUint {

    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";
    public static final byte[] data = "xyz_test".getBytes();

    public static void main(String[] args) throws Exception {
        KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
        SecureRandom random = new SecureRandom();
        // 初始加密，512位已被破解，用1024位,用2048位更安全
        keygen.initialize(1024, random);
        // 取得密钥对
        KeyPair kp = keygen.generateKeyPair();

//		System.out.println("==公钥==");
        PublicKey pubK = kp.getPublic();
        System.err.println("公钥:" + Base64Utils.encodeToString(pubK.getEncoded()));

//		System.out.println("==私钥==");
        PrivateKey priK = kp.getPrivate();
        System.err.println("私钥:" + Base64Utils.encodeToString(priK.getEncoded()));


        /**签名**/
        Signature sig = Signature.getInstance(SIGNATURE_ALGORITHM);
        sig.initSign(priK);
        sig.update(data);
        byte[] s = sig.sign();
        System.out.println("签名内容：" + Base64Utils.encodeToString(s));
        /**验签**/
        sig.initVerify(pubK);
        sig.update(data);
        boolean b = sig.verify(s);
        System.out.println("验签结果:" + b);

        /**加密**/
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubK);
        byte[] bt_encrypted = cipher.doFinal(data);
        System.err.println(Base64Utils.encodeToString(bt_encrypted));
        /**解密**/
        cipher.init(Cipher.DECRYPT_MODE, priK);
        byte[] sec = cipher.doFinal(bt_encrypted);
        System.err.println(new String(sec));
    }

}