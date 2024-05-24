import java.util.Arrays;
import java.util.List;

public class Exercise1SwapEnds {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(8,6,7,9,5);
        swapEnds(nums1);
        System.out.println(nums1);
    }

    public static void swapEnds(List<Integer> nums){
        if(nums.size()==0){
            return;
        }
        int temp = nums.getFirst();
        nums.set(0, nums.getLast());
        nums.set(nums.size()-1, temp);
    }
}
