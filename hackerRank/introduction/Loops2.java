package hackerRank.introduction;
import java.util.*;
import java.io.*;

public class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int fsum = a+(1*b);
            int ssum =0,ffsum;
            int count = 0;
            System.out.print(fsum+" ");
            count++;
            for(int j=2;count<n;j=j*2){
                ssum = ssum+((j*b));
                ffsum = fsum+ssum;
                System.out.print(ffsum+" ");
                count++;

            }
            System.out.println();
        }
        in.close();
    }
}


