//odd only

import java.util.ArrayList;
import java.util.List;

public class Exercises44OddOnly{
    public static void main(String[]args){
        int[] nums1 = {112, 201, 774, 92, 9, 83, 41872};
        int[] nums2 = {1143, 555, 7, 1772, 9953, 643};

        System.out.println("List 1: " + oddOnly(nums1));
        System.out.println("List 2: " + oddOnly(nums2));
        System.out.println("List 3: " + oddOnly(new int[]{734, 233, 782, 811, 3, 9999}));

    }
    static List<Integer> oddOnly(int[] nums){
        List<Integer> result = new ArrayList<Integer>();
        for (int num : nums) {
            if(num%2 != 0){
                result.add(num);
            }
        }
        return result;
    }
}

