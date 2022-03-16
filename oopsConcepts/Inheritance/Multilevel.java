package oopsConcepts.Inheritance;
/*
multilevel inheritance - b extends from a and c extends from b
 */
class A{
    void play(){
        System.out.println("I am A class");
    }
}
class B extends  A{
    void fun(){
        System.out.println("I am B class");
    }
}
class C extends B{
    void cool(){
        System.out.println("I am C class");
    }
}
public class Multilevel {
    public static void main(String args[]){
        C obj = new C();
        obj.cool();
        obj.fun();
        obj.play();
    }
}
