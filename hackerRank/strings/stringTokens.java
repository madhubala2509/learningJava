package hackerRank.strings;

import java.io.*;
import java.util.*;

public class stringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //System.out.println(s);
        // Write your code here.

        if (s.trim().length()==0 || s.trim().length()>400000)
        {
            System.out.println(0);
            return;
        }

        String words[]=s.trim().split("[ !,?.\\_'@]+");
        System.out.println(words.length);
        for (String word:words)
            System.out.println(word);
    }

}

