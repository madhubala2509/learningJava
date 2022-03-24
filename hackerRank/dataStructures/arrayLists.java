package hackerRank.dataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class arrayLists{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> mainrow = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> subrow = new ArrayList<Integer>();
            int size = sc.nextInt();
            for(int j=0;j<size;j++){
                int elem = sc.nextInt();
                subrow.add(elem);
            }
            mainrow.add(subrow);
        }
        int nq = sc.nextInt();
        for(int k=0;k<nq;k++){
            int x= sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(mainrow.get(x-1).get(y-1));
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}

