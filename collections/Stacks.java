package collections;
import javaFeatures.java4and5Features.Subjects;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;
/*
Stack - LIFO
methods - push(), pop(), peek(), empty(), search()
 */
public class Stacks {
    public static void main(String args[]){
        Stack<Integer> sample = new Stack<>();
        int input;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the operation you want to perform");
            System.out.println("1.Push 2.Pop 3.Get top element 4.Get size 5.Check if stack is empty " +
                    "6.Print the elements of stack 7.search");
            input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter the element you want to push");
                    int elem = sc.nextInt();
                    sample.push(elem);
                    break;
                case 2:
                    if(sample.empty()!=true){
                        System.out.println("The element popped out of stack is "+sample.pop());
                    }
                    else{
                        System.out.println("Stack is empty! We cannot pop element");
                    }
                    break;
                case 3:
                    if(sample.empty()!=true){
                        System.out.println("The element at the top of the stack is "+sample.peek());
                    }
                    else{
                        System.out.println("Stack is empty! We cannot get the top element");
                    }
                    break;
                case 4:
                    System.out.println("Size of the stack is "+sample.size());
                    break;
                case 5:
                    System.out.println("Is the stack empty ?"+sample.isEmpty());
                    break;
                case 6:
                    System.out.println("Printing the elements of stack");
                    while(sample.empty()==false){
                        sample.forEach(n ->System.out.println(n));
                        break;
                    }
                    break;
                case 7:
                    System.out.println("Searching an element ");
                    while(sample.empty()==false){
                        System.out.println("Enter the element you want to search");
                        int element = sc.nextInt();
                        int location = sample.search(element);
                        System.out.println(element+" is at the location "+location);
                        break;
                    }
                    break;
            }
        }while(input!=-1);

    }
}
