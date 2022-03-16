package oopsConcepts.Polymorphism;
/*
call to overridden method is resolved at runtime
 */
class Tree{
    void supply(){
        System.out.println("I give fresh air");
    }
}
class appleTree extends Tree{
    @Override
    void supply() {
        System.out.println("I give apples");
    }
}
class papayaTree extends Tree{
    @Override
    void supply() {
        System.out.println("I give papaya's");
    }
}
class mangoTree extends Tree{
    @Override
    void supply() {
        System.out.println("I give mango's");
    }
}
public class runtimePolymorphism {
    public static void main(String args[]){
        Tree t1;
        t1 = new appleTree();  //upcasting
        t1.supply();
        t1 = new mangoTree();
        t1.supply();
        t1 = new papayaTree();
        t1.supply();
    }
}
