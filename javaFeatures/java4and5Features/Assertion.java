package javaFeatures.java4and5Features;
/*
it is a statement in java which is always assumed to be true
if it fails, it will throw an error named assertion error
 */
public class Assertion {
    public static void main(String args[]){
        assert false;
        int maxValue = 9;
        int value = 15;
        assert value<maxValue:"values should not be greater than 9";

    }
}
