package innerClass;
/*
a class inside a method
 */
public class localInnerClass {
    private String str = "Is this really funny?";
    void fun(){
        class havingFun{
            void display(){
                System.out.println("We are learning local inner class. "+str );
            }
        }
        havingFun hf = new havingFun();
        hf.display();
    }
    public static void main(String args[]){
        localInnerClass lic = new localInnerClass();
        lic.fun();
    }
}
