package javaFeatures.java8Features;
interface Student{
    void learn();

}
interface Kid{
    String smile(String str);
}
interface Sum{
    int add(int a,int b);
}
public class lambdaExpressions {
    public static void main(String args[]){
        // no parameter
        Student ss = ()->{
          System.out.println("learning lambda expressions");
        };
        ss.learn();

        // single parameter
        Kid kk = (str)->{
            return "how is my smile? " + str;
        };
        System.out.println(kk.smile("It's adorable"));

        //double parameter
        Sum asd = (int a, int b)->{
            return a+b;
        };
        System.out.println(asd.add(10,30));
    }
}
