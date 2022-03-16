package oopsConcepts.Basics;

class Dog{
    //default constructor
    Dog(){
        System.out.println("Default constructor");
    }
    //parameterized constructor
    Dog(String name){
        System.out.println("My name is "+name);
    }
    //constructor overloading
    Dog(String favFood,String favActivity){
        System.out.println("My favourite food is "+favFood+" and my favourite activity is "+favActivity);
    }
}
public class Constructors {
    public static void main(String args[]){
        Dog d1 = new Dog();
        Dog d2 = new Dog("Jerry");
        Dog d3 = new Dog("Bone","Sleeping");
    }
}
