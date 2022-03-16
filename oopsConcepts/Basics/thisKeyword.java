package oopsConcepts.Basics;

public class thisKeyword {
    int id;
    String name;
    thisKeyword(){
        System.out.println("Default constructor");
    }
    thisKeyword(String name){
        this(); //invoking current class constructor
        System.out.println(name);
    }
    void assignValues(int id,String name){
        this.id = id; //invoking current class variable
        this.name = name;
    }
    void callMethod(){
        System.out.println("Calling current class method");
        this.assignValues(1,"jerry"); //invoking current class method
    }
    public static void main(String args[]){

        thisKeyword tk = new thisKeyword("puppy");
        tk.callMethod();
    }
}
