package javaFeatures.java8Features;
/*
interface with exactly one abstract method
 */
interface Bee{
    void collectHoney();
    /*
    can contain any number of object class methods but only one abstract method
     */
    int hashCode();
    String toString();
    boolean equals(Object ob);
}
public class functionalInterfaces implements Bee{
    @Override
    public void collectHoney(){
        System.out.println("Bee's collect honey from flowers");
    }
    public static void main(String args[]){
        functionalInterfaces fi = new functionalInterfaces();
        fi.collectHoney();

    }
}
