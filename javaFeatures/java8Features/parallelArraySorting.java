package javaFeatures.java8Features;

import java.util.Arrays;

public class parallelArraySorting {
    public static void main(String args[]){
        int arr[] = {7,2,5,9,1,6};

        Arrays.parallelSort(arr,2,5);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.parallelSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
