package javaFeatures.java7Features;
/*
catching multiple exceptions in a single catch block
 */
public class multipleCatch {
    public static void main(String args[]){
        try{
            int res = 5/0;
            int arr[] = new int[5];
            int res2 = arr[10];
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
