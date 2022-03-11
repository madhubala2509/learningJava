package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class sample1 {
    public static void main(String args[]){
        Pattern p = Pattern.compile(".m*");
        Matcher m = p.matcher("smbbb");
        boolean res1 = m.matches();
        System.out.println(res1);

        boolean res2 = Pattern.compile("m.d.").matcher("madu").matches();
        System.out.println(res2);
    }
}
