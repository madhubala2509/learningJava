package javaFeatures.java8Features;
/*
.getEncoder(), .getUrlEncoder(), .getMimeEncoder()
 */
import java.util.Base64;
public class base64EncodeAndDecode {
    public static void main(String args[]){
        Base64.Encoder encoder = Base64.getEncoder();
        String estr = encoder.encodeToString("java8features".getBytes());

        Base64.Decoder decoder = Base64.getDecoder();
        String dstr = new String(decoder.decode(estr));

        System.out.println(estr);
        System.out.println(dstr);
    }
}
