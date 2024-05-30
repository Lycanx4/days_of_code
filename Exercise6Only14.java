public class Exercise6Only14 {
    public static void main(String[] args) {

        System.out.println(only14(new int[]{1,4,1,4,4}));
        
    }

    public static boolean only14(int[] nums){
        for(int n : nums){
            if(n != 1 && n!=4){
                return false;
            }
        }
        return true;
    }
    
}
