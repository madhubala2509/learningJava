package javaFeatures.java8Features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Details{
    int subCode;
    String subName;
    int marks;
    Details(int subCode,String subName,int marks){
        this.subCode = subCode;
        this.subName = subName;
        this.marks = marks;
    }
}
public class Streams {
    public static void main(String args[]){
        List<Details> detailsList = new ArrayList<>();
        detailsList.add(new Details(101,"Maths",80));
        detailsList.add(new Details(102,"English",90));
        detailsList.add(new Details(107,"Science",70));

        //stream filters
        List<String> subNames = detailsList.stream().filter(m -> m.marks>70)
                .map(m->m.subName).collect(Collectors.toList());   //java collectors-Collectors.toList(),ToSet(),ToMap()

        int sum = detailsList.stream().collect(Collectors.summingInt(x -> x.marks));

        long count = detailsList.stream().count();

        //filtering and iterating collections
        detailsList.stream().filter(code -> code.subCode==101)
                        .forEach(code -> System.out.println(code.subName));


        System.out.println(subNames);
        System.out.println(sum);
        System.out.println(count);
    }
}
