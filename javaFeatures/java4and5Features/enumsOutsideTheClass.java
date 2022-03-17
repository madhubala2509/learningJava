package javaFeatures.java4and5Features;

public class enumsOutsideTheClass {
    public static void main(String args[]){
        for(Subjects sub:Subjects.values()){
            System.out.println(sub+" "+sub.value);
        }
    }
}
