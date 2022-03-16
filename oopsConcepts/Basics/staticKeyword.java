package oopsConcepts.Basics;

public class staticKeyword {
    static String code = "All the best";
    int id = 1;
    String name = "madhu";
    /*
    static variable values can be changed by using static method
     */
    static void change(){
         code = "Best wishes";
    }
    public static void main(String args[]){

        staticKeyword sk = new staticKeyword();
        System.out.println(sk.id);
        System.out.println(sk.name);
        //accessing static variables without object
        System.out.println(code);
        change();
        System.out.println(code);
    }
}
