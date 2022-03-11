package strings;

public class intro {
    public static void main(String args[]){
        //Using string literal
        String s1  = "Hello world";
        //using new keyword
        String s2 = new String("Happy weekend");

        //string objects are immutable
        String s3 = "hi";
        s3.concat("there");
        s3 = s3.concat("hello");
        System.out.println(s3);

    }
}
