package oopsConcepts.Abstraction;
interface Teacher{
    void subject();
}
class Staff1 implements Teacher{
    @Override
    public void subject() {
        System.out.println("I teach maths");
    }
}
class Staff2 implements Teacher{
    @Override
    public void subject() {
        System.out.println("I teach java");
    }
}
public class Interfaces {
    public static void main(String args[]){
        //using same reference for different classes
        Teacher t1;
        t1 = new Staff1();
        t1.subject();
        t1 = new Staff2();
        t1.subject();

        //usual method
        Staff1 stf1 = new Staff1();
        stf1.subject();

        Staff2 stf2 = new Staff2();
        stf2.subject();
    }
}
