package javaFeatures.java8Features;
/*
allows us to create default and static methods in the interface
 */
interface Milk{
    default void color(){
        System.out.println("I am white in color");
    }
    static void get(){
        System.out.println("You can get curd from me!");
    }
    void fun();
}
public class defaultMethods implements Milk{
    @Override
    public void fun() {
        System.out.println("It's all about default methods in interface");
    }
    //implementing the abstract method is enough here
}
