package oopsConcepts.Inheritance;
/*
single inheritance - student extends only from class Person
 */
class Person{
    void work(){
        System.out.println("I am an engineer");
    }
}
class Students extends Person{
    void learn(){
        System.out.println("I am studying");
    }
}
public class Single {
    public static void main(String args[]){
        Students st = new Students();
        st.learn();
        st.work();
    }
}
