import java.util.Arrays;

public class Exercise5FizzArray2 {
    public static void main(String[] args) {
        for(int n : fizzArray2(1,10)){
            System.out.print(n + ", ");
        }
        
    }

    public static int[] fizzArray2(int a, int b){
        int[] nums = new int[b-a];
        int index = 0;
        for(int i=a; i<b ;i++){
            nums[index] = i;
            index++;
        }
        return nums;
    }
}
