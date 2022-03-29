package hackerRank.strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result=true;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length()!=b.length()){
            result = false;
        }
        else{
            int count = 0;
            for(char c='a';c<='z';c++){
                for(int i=0;i<a.length();i++){
                    if(a.charAt(i)==c){
                        count++;
                    }
                    if(b.charAt(i)==c){
                        count--;
                    }
                }
                if(count!=0){
                    result = false;
                    break;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
