package oopsConcepts.Polymorphism;
final class Demo{
    // we cannot extend a final class
}
class Demo1{
    final void fun(){
        //final methods cannot be overridden
        System.out.println("I am a final method");
    }
}
public class finalKeyword {
    //final variables value cannot be changed
    final String name = "madhu";
    final String dept;
    finalKeyword(){
        //blank final variable can be initialised using constructor
        dept = "CSE";
    }
}
