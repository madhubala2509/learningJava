package collections;
import java.util.*;
enum workingDays{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
public class enumSet {
    public static void main(String args[]){
        Set<workingDays> sample1 = EnumSet.allOf(workingDays.class);
        Set<workingDays> sample2 = EnumSet.noneOf(workingDays.class);
        Set<workingDays> sample3 = EnumSet.of(workingDays.FRIDAY,workingDays.MONDAY);

        System.out.println(sample1);
        System.out.println(sample2);
        System.out.println(sample3);
    }
}
