package javaFeatures.java4and5Features;
/*
allows to pass zero or multiple arguments
 */
public class varArgs {
    int returnSum(int...values){
        int sum = 0;
        for(int v:values){
            sum = sum+v;
        }
        return sum;
    }
    public static void main(String args[]){
        varArgs va = new varArgs();
        int res1 = va.returnSum(1,2,3,4,5);
        int res2 = va.returnSum(1,2,3);
        int res3 = va.returnSum();
        System.out.println(res1+" "+res2+" "+res3);
    }
}
