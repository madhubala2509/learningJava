package oopsConcepts.Basics;
/*
autoboxing - primitive to wrapper
unboxing - wrapper to primitive
 */
public class wrapperClass {
    public static void main(String args[]){
        int i = 20;
        Integer j = i; // autoboxing

        Integer a = new Integer(30);
        int b = a;  // unboxing

        boolean w = false;
        Boolean q = w;  //autoboxing

        Boolean e = true;
        boolean f = e;   //unboxing

    }
}
