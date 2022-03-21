package collections;
import java.util.*;
class Student{
    int rollNo;
    String name, department;
    Student(int rollNo,String name,String department){
        this.rollNo = rollNo;
        this.name  = name;
        this.department = department;
    }

}
enum departCode{
    CSE(101),ECE(102),IT(103),EEE(104),MECH(105);
    int value;
    departCode(int value){
        this.value = value;
    }
}
public class enumMap {
    public static void main(String args[]){
        EnumMap<departCode,Student> sample = new EnumMap<departCode, Student>(departCode.class);
        Student s1 = new Student(001,"akil","CSE");
        Student s2 = new Student(002,"arun","ECE");
        Student s3 = new Student(003,"madhu","CSE");
        Student s4 = new Student(004,"hari","MECH");

        sample.put(departCode.CSE,s1);
        sample.put(departCode.ECE,s2);
        sample.put(departCode.CSE,s3); //map cannot have duplicate keys, so it will replace akil by madhu
        sample.put(departCode.MECH,s4);

        for(Map.Entry<departCode,Student> mp:sample.entrySet()){
            Student d= mp.getValue();
            System.out.println("DEPARTMENT ID"+mp.getKey().value+" Student roll no "+d.rollNo+" Student name "+d.name);
        }

    }
}
