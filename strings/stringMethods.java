package strings;

import java.nio.charset.StandardCharsets;

public class stringMethods {
    public static void main(String args[]){
        String str = "Playing with string methods in java";
        //charAt() method
        char ch = str.charAt(3);
        System.out.println("Char At "+ch);

        //contains() method
        System.out.println("Contains "+str.contains("string"));

        //startsWith() and endsWith() method
        System.out.println("Starts with "+str.startsWith("P"));
        System.out.println("Ends with "+str.endsWith("java"));

        //format() method
        String s1 = String.format("%s","using %s");
        System.out.println(s1);
        String s2 = String.format("%d",10);
        System.out.println(s2);
        String s3 = String.format("%x",203);
        System.out.println(s3);
        String s4 = String.format("%f",101.0);
        System.out.println(s4);
        String s5 = String.format("%c",'a');
        System.out.println(s5);
        String s6 = String.format("|%10d|",999); //10 spaces in the front
        System.out.println(s6);
        String s7 = String.format("|%010d|",999); // fills zero
        System.out.println(s7);

        //getBytes() method
        System.out.println(str.getBytes(StandardCharsets.UTF_8));

        //getChars() method
        char chArr[] = new char[10];
        str.getChars(6,13,chArr,0);
        System.out.println(chArr);

        //index() method
        System.out.println("Index of a "+str.indexOf('a'));

        //lastIndexOf() method
        System.out.println("Last Index of a "+str.lastIndexOf('a'));

        //isEmpty() method
        System.out.println("Original String empty?"+str.isEmpty());

        //replace() method
        String str1 = str.replace('a','*');
        System.out.println("Replaced string "+str1);

        //toUpperCase() and toLowerCase() methods
        System.out.println("To Upper Case"+str.toUpperCase());
        System.out.println("To lower Case"+str.toLowerCase());

        //split() method
        String splArr[] = str.split(" ");

        //substring() method
        System.out.println("Substring "+str.substring(7));
        System.out.println("Substring "+str.substring(3,14));

        //toCharArray()
        char charr1[] = str.toCharArray();

        //trim() method
        String ss1 = "         java       hello";
        System.out.println(ss1.trim());
    }
}
