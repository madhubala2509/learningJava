package collectionExamples;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/*
implementing a queue using two stacks
 */
public class aTaleOfTwoStacks {
    Stack<Integer> stck1 = new Stack<>();
    Stack<Integer> stck2 = new Stack<>();
    void enqueueElement(int elem){
       stck1.push(elem);
       System.out.println("Inserted");
    }
    void dequeueElement(){
        System.out.println("Dequeued element is ");
        Stack<Integer> dup = (Stack<Integer>) stck1.clone();
        //System.out.println(dup);
        stck2.clear();
        while(!dup.empty()){
            int elem = dup.pop();
            stck2.push(elem);
        }
        int dnum = stck2.pop();
        stck1.removeElement(dnum);
        System.out.println(dnum);
    }
    void peekElement(){
        System.out.println("Head element is ");
        Stack<Integer> dup = (Stack<Integer>) stck1.clone();
        //System.out.println(dup);
        stck2.clear();
        while(!dup.empty()){
            int elem = dup.pop();
            stck2.push(elem);
        }
        int pnum = stck2.peek();
        System.out.println(pnum);

    }
    void printElemnts(){
        System.out.println("elements in stack2 ");
        Stack<Integer> dup = (Stack<Integer>) stck1.clone();
        //System.out.println(dup);
        stck2.clear();
        while(!dup.empty()){
            int elem = dup.pop();
            stck2.push(elem);
        }
        System.out.println(stck2);
    }
    public static void main(String args[]){
        aTaleOfTwoStacks obj = new aTaleOfTwoStacks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queries");
        int nq = sc.nextInt();
        for(int i=0;i<nq;i++){
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("Enter the element to be inserted");
                int elem = sc.nextInt();
                obj.enqueueElement(elem);
            }
            else if(choice==2){
                obj.dequeueElement();
            }
            else if(choice==3){
                obj.peekElement();
            }
            else if(choice==4){
                obj.printElemnts();
            }
        }
    }
}
