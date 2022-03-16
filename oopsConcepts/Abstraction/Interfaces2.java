package oopsConcepts.Abstraction;
interface M{
    void msg();
}
interface K{
    void hello();
}
public class Interfaces2 implements M,K{
    @Override
    public void hello() {
        System.out.println("K interface");
    }

    @Override
    public void msg() {
        System.out.println("M interface");
    }
    public static void main(String args[]){
        Interfaces2 if1 = new Interfaces2();
        if1.hello();
        if1.msg();
    }
}
