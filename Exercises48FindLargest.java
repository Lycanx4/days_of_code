import java.util.Arrays;
import java.util.List;

public class Exercises48FindLargest{
    public static void main(String[]args){
        List<Integer> nums1 = Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997);
        List<Integer> nums2 = Arrays.asList(987, 1234, 9381, 731, 43718, 8932);
        List<Integer> nums3 = Arrays.asList(34070, 1380, 81238, 7782, 234, 64362, 627);
        System.out.println(findLargest(nums1));
        System.out.println(findLargest(nums2));
        System.out.println(findLargest(nums3));
    }

    public static int findLargest(List<Integer> nums){
        int largestNum = nums.get(0);
        for(int i = 1; i<nums.size(); i++){
            int num = nums.get(i);
            largestNum = num>largestNum ? num : largestNum;
        }
        return largestNum;
    }

}

