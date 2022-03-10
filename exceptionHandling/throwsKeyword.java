package exceptionHandling;

import java.io.IOException;

/*
used with method signature
throws more than one exception
 */
public class throwsKeyword {
    static void withException()throws IOException,NumberFormatException {
        throw new NumberFormatException("throwing a number format exception");

    }
    static void withoutException() throws IOException,ArithmeticException{
        System.out.println("No exception occured");
    }
    public static void main(String args[]){
        try{
            withException();
        }
        catch(Exception e){
            System.out.println("Exception caught"+e);
        }
        try{
            withoutException();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("all done");
    }
}

