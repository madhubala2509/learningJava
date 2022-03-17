package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lists {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> li = new LinkedList<>();
        for(int i=0;i<size;i++){
            int num = sc.nextInt();
            li.add(num);
        }
        int nqueries = sc.nextInt();
        for(int i=0;i<nqueries;i++){
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                li.add(x, y);

            }

            else{
                int del = sc.nextInt();
                li.remove(del);
            }
        }
        for(int value:li){
            System.out.print(value+" ");
        }
    }
}

