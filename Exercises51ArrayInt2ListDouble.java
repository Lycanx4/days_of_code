import java.util.ArrayList;
import java.util.List;

public class Exercises51ArrayInt2ListDouble {

    public static void main(String[] args) {
        int[] nums1 = {5, 8, 11, 200, 97};
        int[] nums2 = {745, 23, 44, 9017, 6};
        int[] nums3 = {84, 99, 3285, 13, 877};

        System.out.println(arrayInt2ListDouble(nums1));
        System.out.println(arrayInt2ListDouble(nums2));
        System.out.println(arrayInt2ListDouble(nums3));

    }

    public static List<Double> arrayInt2ListDouble(int[] nums){
        List<Double> result = new ArrayList<>();
        for(int num : nums){
            result.add(num/2.0);
        }
        return result;
    }

}