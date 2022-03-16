package oopsConcepts.Polymorphism;
/*
changing thr functionality of the base class in the child class
static methods cannot be overridden
 */
class Rider{
    void fun(){
        System.out.println("I am a base class");
    }
}
public class Overriding extends Rider{
    @Override
    void fun() {
        System.out.println("I am a child class");
    }
    public static void main(String args[]){
        Overriding ov = new Overriding();
        ov.fun();
    }
}
