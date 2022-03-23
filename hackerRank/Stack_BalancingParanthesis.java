package hackerRank;

import java.util.*;
public class Stack_BalancingParanthesis {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            char arr[] = input.toCharArray();
            Stack<Character> stck = new Stack<>();

            for(int i=0;i<arr.length;i++){
                char inp = arr[i];
                if(inp=='(' || inp=='{' || inp=='['){
                    stck.push(inp);
                }
                else{
                    if(inp==')' && stck.size()>0 && stck.peek()=='('){
                        stck.pop();
                    }
                    else if(inp=='}' && stck.size()>0 && stck.peek()=='{'){
                        stck.pop();
                    }
                    else if(inp==']' && stck.size()>0 && stck.peek()=='['){
                        stck.pop();
                    }
                    else{
                        stck.push(inp);
                    }
                }
            }
            //System.out.println(stck.size());
            if(stck.size()>0){
                System.out.println("false");
                stck.clear();
            }else{
                System.out.println("true");
                stck.clear();
            }

        }

    }
}




