package hackerRank;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Maps{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> phonebook = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phonebook.containsKey(s)){
                System.out.println(s+"="+phonebook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}




