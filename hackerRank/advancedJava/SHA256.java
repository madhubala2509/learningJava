package hackerRank.advancedJava;

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class SHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(str.getBytes());

        for (byte b : digest) {
            System.out.format("%02x", b);
        }

    }
}

