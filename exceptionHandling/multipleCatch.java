package exceptionHandling;
/*
when using multiple catch hierarchy will be from most specific to most generic
only one exception is caught at a time
 */
public class multipleCatch {
    public static void main(String args[]){
        try{
            int num = 50/0;
            int arr[] = new int[5];
            int res = arr[10];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound ");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occured, Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("If no generic exception matches, it will be caught here");
        }
    }
}

