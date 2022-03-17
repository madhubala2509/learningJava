package javaFeatures.java4and5Features;
/*
enum is a data type which contains a fixed set of constants
 */
public class Enums {
    public enum daysOfTheWeek{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
    public static void main(String args[]){
        for(daysOfTheWeek days:daysOfTheWeek.values()){
            System.out.println(days);
        }
        int index = daysOfTheWeek.FRIDAY.ordinal();
        System.out.println(index);


    }
}
