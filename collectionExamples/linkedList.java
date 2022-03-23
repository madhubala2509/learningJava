package collectionExamples;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(7);
        list.add(21);
        System.out.println("Enter the number of elements you want to insert");
        int ne = sc.nextInt();
        for(int i=0;i<ne;i++){
            System.out.println("Enter the element you want to insert");
            int element = sc.nextInt();
            int index = 0;
            while(index<list.size()){
                System.out.println("while");
                if(index==0 && (element < list.getFirst())){
                    System.out.println("if");
                    list.addFirst(element);
                    break;
                }
                else if((element>list.get(index)) && (element<list.get(index+1))){
                    System.out.println("else if");
                    int size = list.size();
                    list.add(index+1,element);
                    System.out.println("added");
                    break;
                }
                else if(element>list.getLast()){
                    System.out.println("else");
                    list.add(element);
                    break;
                }
                index++;
            }

            System.out.println("The list after insertion");
            System.out.println(list);
        }
    }
}
