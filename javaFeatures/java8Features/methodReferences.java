package javaFeatures.java8Features;
interface Teacher{
    void teaches();
}
class Friend{
    static void recall(){
        System.out.println("Teaching concepts before exams");
    }
    void help(){
        System.out.println("Clearing doubts before exams");
    }
}
interface World{
    Message getMessage(String st);
}
class Message{
    Message(String msg){
        System.out.println(msg);
    }
}
public class methodReferences {
    public static void main(String args[]){
        //referring to a static method
        Teacher t1 = Friend::recall;
        t1.teaches();

        //referring to a non-static method
        Friend f1 = new Friend();
        Teacher t2 = f1::help;
        t2.teaches();

        //referring to a constructor
        World w1 = Message::new;
        w1.getMessage("This is a constructor implemented using method reference in java");
    }
}


