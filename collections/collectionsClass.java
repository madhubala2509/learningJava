package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
methods - addAll(), copy(), min(), max(), replaceAll(), reverse(), rotate(), shuffle(), swap(), sort()
 */
public class collectionsClass {
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>(5);
        nums.add(101);
        nums.add(111);
        nums.add(198);
        nums.add(121);
        nums.add(167);

        List<Integer> num = new ArrayList<>(5);
        num.add(201);
        num.add(141);
        num.add(168);
        num.add(154);
        num.add(765);

        //addAll()
        nums.addAll(num);
        System.out.println("After using allAll method "+nums);

        //copy()
        List<Integer> originalList = new ArrayList<>(10);
        originalList.add(1);
        originalList.add(2);
        List<Integer> copyList = new ArrayList<>(15);
        copyList.add(3);
        copyList.add(4);
        copyList.add(5);
        Collections.copy(copyList, originalList);
        System.out.println("Copied List "+copyList);
        System.out.println("original list "+originalList);

        //min and max
        System.out.println("Min is "+Collections.min(nums));
        System.out.println("Max is "+Collections.max(nums));

        //reverse
        Collections.reverse(nums);
        System.out.println("After reversing "+nums);

        //rotate
        Collections.rotate(nums,4);
        System.out.println("After rotating "+nums);

        //Shuffle
        Collections.shuffle(nums);
        System.out.println("After shuffling "+nums);

        //swap
        Collections.swap(nums,0,3);
        System.out.println("After swapping "+nums);

        //sort
        Collections.sort(nums);
        System.out.println("After sorting "+nums);

    }
}
