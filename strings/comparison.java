package strings;

public class comparison {
    public static void main(String args[]){
        //1.equals() method
        String s4 = "HI,THERE";
        String s5 = "hi,there";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        //2.== operator
        String s6 = "equal to operator";
        String s7 = "equal to operator";
        String s8 = new String("equal to operator");
        System.out.println(s6==s7);
        System.out.println(s7==s8);

        //3.compareTo() method
        String s9 = "abcd";
        String s10 = "bacd";
        String s11 = "dcba";
        System.out.println(s9.compareTo(s10));
        System.out.println(s10.compareTo(s11));
        System.out.println(s11.compareTo(s9));
        System.out.println(s9.compareTo(s11));

    }
}
