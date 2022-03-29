package hackerRank.strings;

import java.io.*;
import java.util.*;

public class Introduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len1 = A.length();
        int len2 = B.length();
        int len  = len1+len2;
        System.out.println(len);
        int value = A.compareTo(B);
        if(value > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String a = A.substring(0,1).toUpperCase() + A.substring(1);
        String b = B.substring(0,1).toUpperCase() +B.substring(1);
        System.out.print(a+" "+b);

    }
}




