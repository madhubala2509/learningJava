package innerClass;
/*
class with no name , created in two ways: abstract class or interface
 */
abstract  class Dog{
    abstract void talk();
}

interface Cat{
    void sound();
}
public class anonymousInnerClass {
    public static void main(String args[]){
        Dog doggy = new Dog() {
            @Override
            void talk() {
                System.out.println("I am barking");
            }
        };
        doggy.talk();


        Cat kitty = new Cat(){
            @Override
            public void sound(){
                System.out.println("I am sleeping");
            }
        };
        kitty.sound();
    }
}
