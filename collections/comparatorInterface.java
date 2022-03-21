package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
Provides multiple sorting sequence - you can sort the elements on the basis of any data member
 */
class Fruits{
    String name,vitamin;
    int price;
    Fruits(String name,String vitamin,int price){
        this.name = name;
        this.vitamin = vitamin;
        this.price = price;
    }
}
class priceComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Fruits f1 = (Fruits)o1;
        Fruits f2 = (Fruits)o2;
        if(f1.price<f2.price){
            return 1;
        }
        else if(f1.price>f2.price){
            return -1;
        }
        else{
            return 0;
        }
    }
}
class nameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Fruits f1 = (Fruits)o1;
        Fruits f2 = (Fruits)o2;

        return f1.name.compareTo(f2.name);
    }
}
public class comparatorInterface {
    public static void main(String args[]){
        Fruits f1 = new Fruits("Apple","A",120);
        Fruits f2 = new Fruits("Orange", "C",105);
        ArrayList<Fruits> data = new ArrayList<>();
        data.add(f1);
        data.add(f2);
        data.add(new Fruits("Watermelon","D",50));
        data.add(new Fruits("Mango","K",160));

        System.out.println("Price Comparator in descending");
        Collections.sort(data,new priceComparator());
        Iterator itr =  data.iterator();
        while(itr.hasNext()){
            Fruits fr = (Fruits)itr.next();
            //int price = (int) fr.price;
            System.out.println(fr.price+" "+fr.name+" "+fr.vitamin);
        }

        System.out.println("NAme Comparator in ascending ");
        Collections.sort(data,new nameComparator());
        Iterator it =  data.iterator();
        while(it.hasNext()){
            Fruits fr = (Fruits)it.next();
            //int price = (int) fr.price;
            System.out.println(fr.price+" "+fr.name+" "+fr.vitamin);
        }
    }
}
