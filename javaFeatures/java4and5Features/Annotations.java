package javaFeatures.java4and5Features;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
Built in - @Override, @SuppressWarnings, @Deprecated
Built in used in custom annotations - @Target, @Retention, @Inherited, @Documented
 */
class Dog{
    void bark(){

    }
}
class Puppy extends Dog{
    @Override    //annotation:ensures sub class overrides the parent class method
    void bark() {
        super.bark();
    }
}
public class Annotations {
    //custom anotations
    @Target(ElementType.METHOD)  //built in annotation used in custom annotation
    @interface sample1{}     //marker annotation-no method
    @interface sample2{int value() default 7;}      //single valued annotation-one method
    @interface sample3{int value(); String name();}     //multivalued annotation-more than one method

    @sample1
    @sample2(value=0)
    @sample3(value = 8,name="nothing")

    void fun(){

    }

}
