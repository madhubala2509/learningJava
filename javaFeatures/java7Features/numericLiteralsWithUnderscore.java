package javaFeatures.java7Features;
/*
no underscore at the beginning or end of the number
no underscore adjacent to decimal points
 */
public class numericLiteralsWithUnderscore {
    public static void main(String args[]){
        int num1 = 10_000;
        float num2 = 10.5_0000F;
        System.out.println(num1+" "+num2);

    }
}
