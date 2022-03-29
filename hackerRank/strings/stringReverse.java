package hackerRank.strings;

import java.io.*;
import java.util.*;

public class stringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=new String(sc.next()) ;
        /* Enter your code here. Print output to STDOUT. */
        char original[] = A.toCharArray();
        char reverse[] = A.toCharArray();
        boolean flag = true;
        for(int i=0,j=reverse.length-1;i<original.length && j>=0;i++,j--){
            if(original[i]!=reverse[j]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}




