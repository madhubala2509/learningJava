package collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
/*
combination of hashtable and linked list implementation
contains unique elements only, allows null
maintains insertion order
we can create user defined linkedHashSet :LinkedHashSet<College> socialMedia = new LinkedHashSet<>();
 */
public class linkedHashSet {
    public static void main(String args[]){
        LinkedHashSet<String> socialMedia = new LinkedHashSet<>();
        socialMedia.add("Whatsapp");
        socialMedia.add("Facebook");
        socialMedia.add("Instagram");
        socialMedia.add(null);
        socialMedia.add("Snapchat");
        socialMedia.add("Twitter");
        socialMedia.add("Whatsapp");   //ignores duplicate elements

        socialMedia.forEach(items->System.out.println(items));
    }
}
