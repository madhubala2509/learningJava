package oopsConcepts.Abstraction;
/*
abstract class - has both abstract and non-abstract methods.
 */
abstract class Pets{
    void dog(){
        System.out.println("I have two puppies");
    }
    abstract void behaviour();
}
public class abstractClass extends Pets{
    @Override
    void behaviour() {
        System.out.println("They are very energetic");
    }
    public static void main(String args[]){
        abstractClass ac= new abstractClass();
        ac.dog();
        ac.behaviour();
    }
}
