package innerClass;
/*
an interface inside another interface
 */
interface Dogs{
    void bark();
    interface Puppy{
        void play();
    }
}
public class nestedInterface implements Dogs.Puppy {
    public void play(){
        System.out.println("I love playing ");
    }
    public static void main(String args[]){
        Dogs.Puppy dp = new nestedInterface();
        dp.play();
    }
}
