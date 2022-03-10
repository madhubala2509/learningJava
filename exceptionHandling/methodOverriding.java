package exceptionHandling;
class Teacher{
    void learn(){
        System.out.println("Teaching");
    }
}
class Student extends Teacher{
    /*
    cannot use checked exceptions here as parent has no exceptions thrown
     */
    void learn() throws NullPointerException{
        System.out.println("Learning");
    }
}
class Dog{
    void bark() throws NumberFormatException{
        System.out.println("Barking");
    }
}
class Puppy extends Dog{
    /*
    Cannot use parent exceptions , use only subclass exception or no exception
    ex: throws exception cannot be given
     */
    void bark() throws ArithmeticException{
        System.out.println("Sleeping");
    }
}
public class methodOverriding {
    public static void main(String args[]){
        System.out.println("Basic rules with method overriding and exceptions");
    }
}


