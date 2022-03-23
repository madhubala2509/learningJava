package collectionExamples;

import java.util.HashMap;
import java.util.Map;

//collectionExamples.Anagrams using hashmap
public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result;
        char a1[] = a.toCharArray();
        char b1[] = b.toCharArray();
        Map<Character,Integer> hm1 = new HashMap();
        Map<Character,Integer> hm2 = new HashMap();
        for(int i=0;i<a1.length;i++){
            if(hm1.containsKey(a1[i])){
                hm1.put(a1[i],hm1.get(a1[i])+1);
            }
            else{
                hm1.put(a1[i],1);
            }
        }
        for(int j=0;j<b1.length;j++){
            if(hm2.containsKey(b1[j])){
                hm2.put(b1[j],hm2.get(b1[j])+1);
            }
            else{
                hm2.put(b1[j],1);
            }
        }
        if(hm1.equals(hm2)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        boolean result = isAnagram("anana","ananaa");
        System.out.println(result);
    }
}

