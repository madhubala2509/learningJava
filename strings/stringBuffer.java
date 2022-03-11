package strings;
/*
Similarly, string builder can be used instead of string buffer
 */
public class stringBuffer {
    public static void main(String args[]){
        StringBuffer sb1 = new StringBuffer("String Buffer ");
        StringBuffer sb2 = new StringBuffer("Mutable Objects");

        sb1.append(sb2);
        System.out.println(sb1);

        sb1.insert(6,"hi");
        System.out.println(sb1);

        sb1.replace(6,7,"good");
        System.out.println(sb1);

        sb1.delete(6,11);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

    }
}
