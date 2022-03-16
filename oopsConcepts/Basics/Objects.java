package oopsConcepts.Basics;
/*
3 ways to initialize an object: by reference variable, by method, by constructor
 */
class Trial{
    int id;
    String code;
    Trial(int ids,String codes){
        id = ids;
        code = codes;
    }

    void assignValues(int i,String c){
        id = i;
        code = c;
    }
    void display(){
        System.out.println(id+" "+code);
    }
}
public class Objects {
    public static void main(String args[]){
        //by constructor
        Trial t1 = new Trial(3,"c");
        t1.display();

        //by reference variable
        t1.id = 1;
        t1.code = "a";
        System.out.println(t1.code+" "+t1.id);

        //by methods
        t1.assignValues(2,"b");
        System.out.println();
        t1.display();


    }
}
