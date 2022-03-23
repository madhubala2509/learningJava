package collectionExamples;

import java.util.BitSet;

/*
grows automatically as more bits are needed
each bit contains either true or false
initially all have false value
methods: set(), cardinality(), and(), andNot(), clear(), clone(), equals(), flip(), get(), intersects(), isEmpty()
length(), size(), or(),
 */
public class bitSets {
    public static void main(String args[]){
        BitSet bs1 = new BitSet(5);
        BitSet bs2 = new BitSet(5);
        bs1.set(4);
        bs1.set(1);
        bs1.set(7);
        bs1.set(9);

        bs2.set(2);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        bs2.set(9);

        //cardinality() - returns the number of bit with "1's"
        System.out.println("After setting values to bs1 "+bs1);
        System.out.println("Cardinality of bs1 "+bs1.cardinality());

        System.out.println("After setting values to bs1 "+bs2);
        System.out.println("Cardinality of bs1 "+bs2.cardinality());

        //and()
        bs1.and(bs2);
        System.out.println("After and operation bs1 "+bs1);

        //andNot() - opposite of and
        bs1.andNot(bs2);
        System.out.println("After andNot operation bs1 "+bs1);

        //clear() - empties the bitset
        bs1.clear();
        System.out.println("After clearing bs1 "+bs1);

        //clone()
        BitSet bs3 = (BitSet)bs1.clone();
        System.out.println("After cloning bs3 "+bs3);

        //equals()
        System.out.println("Checking if bs1 and bs3 are equal "+bs1.equals(bs3));

        //flip() - flips true to false and false to true
        bs1.flip(4);
        System.out.println("After flip bs1 "+bs1);

        //get()
        System.out.println("Using get at bs1 4 "+bs1.get(4));

        //intersects()
        System.out.println("Intersection of bs1 and bs2 "+bs1.intersects(bs2));

        //isEmpty()
        System.out.println("Is bs1 empty ? "+bs1.isEmpty());

        //length()
        System.out.println("Length of bs1 "+bs1.length());

        //or()
        bs1.or(bs2);
        System.out.println("After performing or bs1 "+bs1);

        //size()
        System.out.println("Size of bs1 "+bs1.size());

        //nextClearBit() -index of the first bit which is set to false that occurs on or after the specified index
        System.out.println("Next clear Bit after 1 is "+bs1.nextClearBit(1));

        //nextSetBit() -index of the first bit which is set to true that occurs on or after the specified index
        System.out.println("Next set bit after 3 is "+bs1.nextSetBit(3));

        //previousClearBit() -index of the nearest bit which is set to false that occurs on or before the specified index
        System.out.println("Previous clear bit before 4 is "+bs1.previousClearBit(4));

        //previousSetBit() -index of the nearest bit which is set to true that occurs on or before the specified index
        System.out.println("Previous set bit after 3 is "+bs1.previousSetBit(3));
    }
}
