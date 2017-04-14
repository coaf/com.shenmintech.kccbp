package com.shenmintech.common.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {

  public static String EKEY = "shenmin20150908!";

  public static String encrypt(String data) throws Exception {
    return encrypt(data, null);
  }

  @SuppressWarnings("restriction")
  public static String encrypt(String data, String key) throws Exception {
    try {
      String iv = "xxxxxxxxxxxxxxxx";
      if (key == null || key.trim().length() == 0) key = "xxxxxxxxxxxxxxxx";
      Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
      int blockSize = cipher.getBlockSize();
      byte[] dataBytes = data.getBytes("UTF-8");
      int plaintextLength = dataBytes.length;
      if (plaintextLength % blockSize != 0) {
        plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
      }
      byte[] plaintext = new byte[plaintextLength];
      System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

      SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
      IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
      cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
      byte[] encrypted = cipher.doFinal(plaintext);
      return new sun.misc.BASE64Encoder().encode(encrypted);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public static String desEncrypt(String data) throws Exception {
    return desEncrypt(data, null);
  }

  @SuppressWarnings("restriction")
  public static String desEncrypt(String data, String key) throws Exception {
    try {
      String iv = "xxxxxxxxxxxxxxxx";
      if (key == null || key.trim().length() == 0) key = "xxxxxxxxxxxxxxxx";

      byte[] encrypted1 = new sun.misc.BASE64Decoder().decodeBuffer(data);

      Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
      SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
      IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());

      cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
      byte[] original = cipher.doFinal(encrypted1);
      String originalString = new String(original);
      return originalString;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
