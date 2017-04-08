package com.yubinggao.lib.utils.passworld;

import android.util.Base64;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/**
 * Android 3DES加密工具类
 */
public class AndroidDes3Util {

    // 密钥 长度不限
    private final static byte[] key = "891worl@".getBytes();
    // 密钥 长度不得小于24
    private final static byte[] edeKey = "123456789012345678901234".getBytes();
    // 向量 可有可无 终端后台也要约定8位
    private final static byte[] iv = "891worl@".getBytes();
    // 加解密统一使用的编码方式
    private final static String encoding = "utf-8";
    public static final String ENCRYPT_MODE_DES = "DES";
    public static final String ENCRYPT_MODE_DES_CBC = "DES/CBC/PKCS5Padding";

    /**
     * 3 DES加密
     *
     * @param plainText 普通文本
     * @return
     * @throws Exception
     */
    public static String encode(String plainText) throws Exception {
        DESedeKeySpec spec = new DESedeKeySpec(edeKey);
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        Key deskey = keyfactory.generateSecret(spec);
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
        byte[] encryptData = cipher.doFinal(plainText.getBytes(encoding));
        return Base64.encodeToString(encryptData, Base64.DEFAULT);
    }

    /**
     * 3DES解密
     *
     * @param encryptText 加密文本
     * @return
     * @throws Exception
     */
    public static String decode(String encryptText) throws Exception {
        DESedeKeySpec spec = new DESedeKeySpec(edeKey);
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        Key deskey = keyfactory.generateSecret(spec);
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, deskey, ips);
        byte[] decryptData = cipher.doFinal(Base64.decode(encryptText, Base64.DEFAULT));
        return new String(decryptData, encoding);
    }

    /**
     * DES CBC 模型
     *
     * @param opMode ENCRYPT_MODE DECRYPT_MODE
     * @return Cipher
     * @throws Exception
     */
    private static Cipher cbcMode(int opMode) throws Exception {
        DESKeySpec dks = new DESKeySpec(key);
        SecretKeyFactory skf = SecretKeyFactory.getInstance(ENCRYPT_MODE_DES);
        Cipher cipher = Cipher.getInstance(ENCRYPT_MODE_DES_CBC);
        SecretKey sk = skf.generateSecret(dks);
        IvParameterSpec ips = new IvParameterSpec(iv);
        cipher.init(opMode, sk, ips);
        return cipher;
    }

    /**
     * 加密
     *
     * @param message 待加密文本
     * @return message
     * @throws Exception
     */
    public static String encodeCBC(String message) throws Exception {
        return Base64.encodeToString(cbcMode(Cipher.ENCRYPT_MODE).doFinal(message.getBytes(encoding)), Base64.DEFAULT);
    }

    /**
     * 解密
     *
     * @param message 待解密文本
     * @return message
     * @throws Exception
     */
    public static String decodeCBC(String message) throws Exception {
        return new String(cbcMode(Cipher.DECRYPT_MODE).doFinal(Base64.decode(message, Base64.DEFAULT)), encoding);
    }
}