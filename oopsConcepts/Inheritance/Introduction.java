package oopsConcepts.Inheritance;
/*
 IS-A relationship
 */
class Oops{
    void msg(){
        System.out.println("Learning basics of oops concepts");
    }
}
class Basics extends Oops{
    /*
    sub class will have both it's parent and it's unique functionality
     */
    void show(){
        System.out.println("This is the beginning to inheritance");
    }
}
public class Introduction{
    public static void main(String args[]){
        Basics bs = new Basics();
        bs.show();
        bs.msg();
    }
}
