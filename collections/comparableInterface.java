package collections;

import java.util.ArrayList;
import java.util.Collections;
/*
Provides single sorting sequence - you can sort the elements on the basis of single data member only
 */
class Kids implements Comparable<Kids>{
    String name;
    int age,grade;
    Kids(String name,int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int compareTo(Kids kd) {
        if(grade<kd.grade){
            return 1;
        }
        else if(grade>kd.grade){
            return -1;
        }
        else{
            return 0;
        }
    }

}
public class comparableInterface {
    public static void main(String args[]){
        ArrayList<Kids> data = new ArrayList<>();
        Kids k3 = new Kids("kavi",17,12);
        Kids k4 = new Kids("madhu",15,10);
        data.add(new Kids("harith",8,5));
        data.add(new Kids("kavya",5,1));
        data.add(k3);
        data.add(k4);
        Collections.sort(data);  //sorting based on grades in descending order
        for(Kids details:data){
            System.out.println(details.name+" "+details.age+" "+details.grade);
        }

    }
}
