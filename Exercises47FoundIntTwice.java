import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercises47FoundIntTwice{
    public static void main(String[]args){
        List<Integer> nums1 = Arrays.asList(5, 7, 9, 5, 11);
        List<Integer> nums2 = Arrays.asList(6, 8, 10, 11, 13);
        List<Integer> nums3 = Arrays.asList(9, 23, 44, 2, 88, 44);
        System.out.println(foundIntTwice(nums1));
        System.out.println(foundIntTwice(nums2));
        System.out.println(foundIntTwice(nums3));
    }

    private static boolean foundIntTwice(List<Integer> nums){
        Collections.sort(nums);
        for(int i = 1; i< nums.size(); i++){
            if(nums.get(i)==nums.get(i-1)){
                return true;
            }
        }
        return false;
    }
}

