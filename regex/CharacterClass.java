package regex;
import java.util.regex.Pattern;

public class CharacterClass {
    public static void main(String args[]){
        System.out.println(Pattern.matches("[amn]","m")); // single character a or m or n
        System.out.println(Pattern.matches("[a-zA-Z]","aB"));//any single character from a-z or A-Z
        System.out.println(Pattern.matches("[^madhu]","k")); //any character except madhu
        System.out.println(Pattern.matches("[a-z&&[^madhu]]","ka")); // any character from a-z except madhu
        System.out.println(Pattern.matches("[a-z&&[madhu]]","m")); // any character from madhu(intersection from a-z)

    }
}
