package strings;
import java.util.StringTokenizer;
public class stringTokenizer {
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("Hi I am Using string tokenizer class",",");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
