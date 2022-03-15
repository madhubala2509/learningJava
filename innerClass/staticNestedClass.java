package innerClass;
/*
a static class inside a class. it can access the static members of the outer class even if it's private
it cannot access non-static members
 */
public class staticNestedClass {
    static String str = "I am static string";
    static class Nested{
        void msg(){
            System.out.println("I am going to send you a message");
            System.out.println(str);
        }
        static void hello(){
            System.out.println("You can call me without an object. Because , I am a static method");
        }
    }
    public static void main(String args[]){
        staticNestedClass.Nested snc = new staticNestedClass.Nested();
        snc.msg();

        staticNestedClass.Nested.hello();
    }
}
