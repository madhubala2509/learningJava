package oopsConcepts.Inheritance;
/*
HAS-A realtionship
 */
class Intro{
    String title = "Final year project";
    int totalReviews = 4;
    String status = "on-going";
    int calc(int completed){
        return totalReviews-completed;
    }
}
class Project{
    int percent = 30;
    int completed = 1;
    Intro inr; //aggregation
    void print(){
        inr = new Intro();
        System.out.println("The project title is "+inr.title);
        System.out.println("Number of reviews in total "+inr.totalReviews);
        System.out.println("Status "+inr.status);
        System.out.println("Left reviews "+inr.calc(completed));
        System.out.println("Completed Percentage "+percent);
    }
}
public class Aggregation {
    public static void main(String args[]){
        Project p1 = new Project();
        p1.print();
    }
}
