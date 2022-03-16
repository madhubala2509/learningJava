package oopsConcepts.Abstraction;

abstract class CGPA{
    abstract int getMarks();
}
class Student1 extends CGPA{
    @Override
    int getMarks() {
        return 9;
    }
}
class Student2 extends CGPA{
    @Override
    int getMarks() {
        return 7;
    }
}
public class abstractClass2 {
    public static void main(String args[]){
        CGPA cs;
        cs = new Student1();
        System.out.println(cs.getMarks());
        cs = new Student2();
        System.out.println(cs.getMarks());
    }
}
