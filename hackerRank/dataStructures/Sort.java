package hackerRank.dataStructures;

import java.util.*;

class Studnt{
    private int id;
    private String fname;
    private double cgpa;
    public Studnt(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Sort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Studnt> studentList = new ArrayList<Studnt>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Studnt st = new Studnt(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList,  Comparator.comparing(Studnt :: getCgpa).reversed().
                thenComparing(Studnt :: getFname).thenComparing(Studnt :: getId));

        for(Studnt st: studentList){
            System.out.println(st.getFname());
        }
    }
}




