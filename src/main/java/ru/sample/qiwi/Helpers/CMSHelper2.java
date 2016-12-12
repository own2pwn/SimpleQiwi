package ru.sample.qiwi.Helpers;

import sun.misc.BASE64Encoder;
import sun.security.pkcs.ContentInfo;
import sun.security.pkcs.PKCS7;
import sun.security.pkcs.SignerInfo;
import sun.security.provider.X509Factory;
import sun.security.util.DerOutputStream;
import sun.security.util.DerValue;
import sun.security.x509.AlgorithmId;
import sun.security.x509.X500Name;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

/**
 * Created by tikhoninav on 05.10.2016.
 */
public class CMSHelper2 {

    public static byte[] sign(byte[] data, PrivateKey key, X509Certificate cert) throws Exception {
        Signature signature = Signature.getInstance("Sha1WithRSA");
        signature.initSign(key);
        signature.update(data);
        byte[] signedData = signature.sign();

        X500Name xName = X500Name.asX500Name(cert.getSubjectX500Principal());
        BigInteger serial = cert.getSerialNumber();
        AlgorithmId digestAlgorithmId = new AlgorithmId(AlgorithmId.SHA_oid);
        AlgorithmId signAlgorithmId = new AlgorithmId(AlgorithmId.RSAEncryption_oid);

        SignerInfo signerInfo = new SignerInfo(xName, serial, digestAlgorithmId, signAlgorithmId, signedData);
        ContentInfo contentInfo = new ContentInfo(ContentInfo.DIGESTED_DATA_OID, new DerValue(DerValue.tag_OctetString, data));
        PKCS7 pkcs7 = new PKCS7(new AlgorithmId[]{digestAlgorithmId}, contentInfo, new X509Certificate[]{cert}, new SignerInfo[]{signerInfo});
        ByteArrayOutputStream baos = new DerOutputStream();
        pkcs7.encodeSignedData(baos);
        byte[] encodedPKCS7 = baos.toByteArray();
        return encodedPKCS7;
    }

    public static String signPEM(byte[] data, PrivateKey key, X509Certificate cert) throws Exception {
        byte[] encodedPKCS7 = sign(data, key, cert);

        BASE64Encoder encoder = new BASE64Encoder();

        return "-----BEGIN PKCS7-----" + "\n" + new String(encoder.encode(encodedPKCS7)) + "\n" + "-----END PKCS7-----";
    }
}

