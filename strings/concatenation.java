package strings;

import java.util.StringJoiner;

public class concatenation {
    public static void main(String args[]){
        //+ operator
        String s1 = "concat";
        String s2 =  "enation";
        System.out.println(s1+s2);

        //concat() method
        String s3 = "string";
        String s4 =  "concatenation";
        System.out.println(s3.concat(s4));

        //append() method
        StringBuilder ss1 = new StringBuilder("string");
        StringBuilder ss2 = new StringBuilder("builder");
        System.out.println(ss1.append(ss2));

        //format() method
        String sf1 = new String("String");
        String sf2 = new String("format");
        String sf3= String.format("%s%s",sf1,sf2);
        System.out.println(sf3.toString());

        //join() method
        String sj1 = new String("join");
        String sj2 = new String("method");
        String sj3 = String.join(",",sj1,sj2);
        System.out.println(sj3.toString());

        //String Joiner class
        StringJoiner s = new StringJoiner(",");
        s.add("string");
        s.add("joiner");
        System.out.println(s.toString());
    }
}
