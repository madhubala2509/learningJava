package exceptionHandling;

public class finallyBlock {
    static void withException(){
        try{
            int a=50/0;
        }catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Finally block is executed with or without exceptions");
        }
    }
    static void withoutException(){
        try{
            int a=50/10;
        }catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Finally block is executed with or without exceptions");
        }
    }
    public static void main(String args[]){
        withException();
        withoutException();
    }
}

