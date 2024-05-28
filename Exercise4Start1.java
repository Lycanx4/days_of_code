public class Exercise4Start1 {
    public static void main(String[] args) {

        System.out.println(start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(start1(new int[]{7, 2, 3}, new int[]{1}));
        System.out.println(start1(new int[]{1, 2}, new int[]{}));
        
    }

    public static int start1(int [] nums1, int[] nums2){
        int count = 0;
        if(nums1.length > 0 && nums1[0]==1){
            count++;
        }
        if(nums2.length > 0 && nums2[0]==1){
            count++;
        }

        return count;
    }
}
