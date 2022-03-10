package exceptionHandling;

public class tryCatch {
    static void arithmetic(){
        try{
            int res = 15/0;
        } catch(ArithmeticException e ){
            System.out.println(e);
        }
    }
    static void nullPointer(){
        try{
            String res = null;
            System.out.println(res.length());
        } catch(NullPointerException e){
            System.out.println(e);
        }
    }
    static void arrayIndexOutofBound(){
        try{
            int arr[] = new int[5];
            int res = arr[15];

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static void numberFormat(){
        try{
            String str = "HelloExceptions";
            int res = Integer.parseInt(str);
        }catch (NumberFormatException e) {
            System.out.println("String cannot be converted to an integer");
        }
    }
    public static void main(String args[]){
        arithmetic();
        nullPointer();
        arrayIndexOutofBound();
        numberFormat();
    }
}

