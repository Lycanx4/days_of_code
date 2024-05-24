public class Exercise2Has12 {
    public static void main(String[] args) {

        System.out.println(has12(new int[]{1, 3, 2}));
        System.out.println(has12(new int[]{3, 1, 2}));
        System.out.println(has12(new int[]{2, 3, 1, 4, 5}));
        
    }

    public static boolean has12(int[] nums){
        boolean has1 = false;
        for(int num : nums){
            if(num == 1){
                has1 = true;
            }
            if(has1 && num==2){
                return true;
            }
        }
        return false;
    }
}
