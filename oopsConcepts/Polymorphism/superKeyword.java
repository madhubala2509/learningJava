package oopsConcepts.Polymorphism;
class Keyword{
    String name =  "Madhu";
    Keyword(){
        System.out.println("I am the base class constructor");
    }
    void fun(){
        System.out.println("I am the super class method");
    }
}
public class superKeyword extends Keyword{

    superKeyword(){
        // automatically invokes base class constructor
        System.out.println("I am the sub class constructor");
    }
    void fun(){
        super.fun();// invoking base class method
        System.out.println("I am the child class method");
    }
    void newInfo(){
        System.out.println("I am the unique feature of child class");
    }
    void print(){
        System.out.println("Welcome "+super.name); // invoking base class variable
    }
    public static void main(String args[]){
        superKeyword sk = new superKeyword();
        sk.fun();
        sk.print();
        sk.newInfo();
    }
}
