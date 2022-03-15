package innerClass;
/*
non-static class inside a class
 */
public class memberInnerClass {
    class insideClass{
        void msg(){
            System.out.println("I am inside the member inner class ");
        }
    }
    public static void main(String args[]){
        memberInnerClass mic = new memberInnerClass();
        memberInnerClass.insideClass obj = mic.new insideClass();
        obj.msg();

    }
}
