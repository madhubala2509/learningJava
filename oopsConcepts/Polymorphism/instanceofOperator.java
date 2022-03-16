package oopsConcepts.Polymorphism;
/*
used to test whether the object is an instance of the specified type
 */
class Doggo{

}
public class instanceofOperator {
    public static void main(String args[]){
        Doggo d1 = new Doggo();
        boolean res1 = d1 instanceof Doggo;
        System.out.println(res1);
        String name = "jax";
        System.out.println(name instanceof String);

    }
}
