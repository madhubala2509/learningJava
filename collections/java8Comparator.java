package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Vegetables{
    String name;
    int price,preferrance;
    Vegetables(String name,int price,int preferrance){
        this.name = name;
        this.price = price;
        this.preferrance = preferrance;
    }
    int getPrice(){
        return price;
    }
    String getName(){
        return name;
    }
    int getPreferrance(){
        return preferrance;
    }
}
public class java8Comparator {
    public static void main(String args[]){
        LinkedList<Vegetables> ll = new LinkedList<>();
        ll.add(new Vegetables("Oninon",210,5));
        ll.add(new Vegetables("carrot",130,4));
        ll.add(new Vegetables("bitterguard",80,3));
        ll.add(new Vegetables("cabbage",110,4));
        ll.add(new Vegetables("beetroot",70,1));

        System.out.println("By price");
        Comparator<Vegetables> cmp1 = Comparator.comparing(Vegetables::getPrice);
        Collections.sort(ll,cmp1);
        for(Vegetables veg:ll){
            System.out.println(veg.name+" "+veg.price+" "+veg.preferrance);
        }

        System.out.println("By preferance in reverse order");
        Comparator<Vegetables> cmp2 = Comparator.comparing(Vegetables::getPreferrance).reversed();
        Collections.sort(ll,cmp2);
        for(Vegetables veg:ll){
            System.out.println(veg.name+" "+veg.price+" "+veg.preferrance);
        }


    }
}
