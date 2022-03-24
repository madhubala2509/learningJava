package hackerRank.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
import java.lang.Comparable;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    int id;
    double cgpa;
    String name;
    Student(int id,String name,double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    int getID(){
        return id;
    }
    String getName(){
        return name;
    }
    double getCGPA(){
        return cgpa;
    }
    public int compareTo(Student s)
    {
        if(cgpa == s.cgpa)
        {
            if(name.compareTo(s.name) == 0)
            {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}
class Priorities{
    List<Student> getStudents(List<String> events){
        ArrayList<Student> data = new ArrayList<>();
        int size = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<>();
        for(String eve:events){
            String[] s = new String[4];
            s = eve.split("\\s");
            if(s.length>1)
            {
                pq.add(new Student(Integer.valueOf(s[3]),s[1],Double.valueOf(s[2])));
            }
            else
            {
                pq.poll();
            }
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().name);
        }

        return new ArrayList<Student>(pq);
    }
}


public class PriorityQueues {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}