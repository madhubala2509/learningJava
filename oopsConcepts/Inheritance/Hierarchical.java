package oopsConcepts.Inheritance;
/*
Hierarchical - both the classes E and F extends from class D
 */
class D{
    void msg(){
        System.out.println("I am class D");
    }
}
class E extends D{
    void show(){
        System.out.println(" I am class E");
    }
}
class F extends D{
    void print(){
        System.out.println("I am class F");
    }
}
public class Hierarchical {
    public static void main(String args[]){
        F f1 = new F();
        f1.print();
        f1.msg();

        E e1 = new E();
        e1.show();
        e1.msg();
    }
}
