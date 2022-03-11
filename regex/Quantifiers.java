package regex;
import java.util.regex.Pattern;
public class Quantifiers {
    public static void main(String args[]){
        /*
        M? - M occurs once or not at all
        M+ - M occurs once or more time
        M* - M occurs zero or more time
        M{n} - M occurs n times
        M{n,} - M occurs n or more than n
        M{x,y} - M occurs atleast x times but not more than y times
         */
        System.out.println(Pattern.matches("[a-z]?","a"));
        System.out.println(Pattern.matches("[a-z]+","abcd"));
        System.out.println(Pattern.matches("[a-z]*",""));
        System.out.println(Pattern.matches("[a-z]{8,10}","abcdefghi"));
        /*
        valid username,password and phone number
         */
        System.out.println(Pattern.matches("[a-zA-Z0-9]*","m*dhu"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]*","madhu8484"));

        System.out.println(Pattern.matches("[6789]{1}\\d{9}","6865531213"));

        System.out.println(Pattern.matches("[a-z]{1,}[A-Z]{1,}[0-9]{1,}[^a-zA-Z0-9]{1,}","aA0"));

    }
}
