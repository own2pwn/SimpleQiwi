package ru.sample.qiwi.Helpers;

import ru.CryptoPro.JCP.JCP;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by tikhoninav on 30.08.2016.
 */
public class HashHelper {
    public static byte[] getSHA256Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] result = md.digest(input.getBytes());
        return result;
    }

    public static byte[] getSHA1Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] result = md.digest(input.getBytes());
        return result;
    }

    public static byte[] getGOST1994Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(JCP.GOST_DIGEST_NAME);
        byte[] result = md.digest(input.getBytes());
        return result;
    }

    public static byte[] getGOST2012256Hash(String input) throws NoSuchAlgorithmException {
        //TODO: Отсутвует JCP.GOST_DIGEST_2012_256_NAME
        MessageDigest md = MessageDigest.getInstance("GOST3411_2012_256");
        byte[] result = md.digest(input.getBytes());
        return result;
    }

    public static byte[] getGOST2012512Hash(String input) throws NoSuchAlgorithmException {
        //TODO: Отсутвует JCP.GOST_DIGEST_2012_512_NAME
        MessageDigest md = MessageDigest.getInstance("GOST3411_2012_512");
        byte[] result = md.digest(input.getBytes());
        return result;
    }

    public static String getSHA1Hash2(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] result = md.digest(input.getBytes());
        return StringHelper.toHexString(result);
    }
}
