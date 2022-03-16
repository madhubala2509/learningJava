package oopsConcepts.Basics;
/*
the class should implement Clonable else it throws CloneNotSupportException
use clone() method
 */
public class objectCloning implements Cloneable{
    int i ;
    String name ;
    public static void main(String args[]) throws CloneNotSupportedException{
        objectCloning oc = new objectCloning();
        oc.i = 1;
        oc.name = "madhu";
        System.out.println(oc.i+" "+oc.name);
        objectCloning oc2 = (objectCloning) oc.clone();
        System.out.println(oc2.i+" "+oc2.name);

    }
}
