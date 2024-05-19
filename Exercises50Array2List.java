import java.util.ArrayList;
import java.util.List;

public class Exercises50Array2List {
    public static void main(String[] args) {
        String[] strs1 = {"Apple", "Orange", "Banana"};
        String[] strs2 = {"Red", "Orange", "Yellow"};
        String[] strs3 = {"Left", "Right", "Forward", "Back"};
        System.out.println(arrayToList(strs1));
        System.out.println(arrayToList(strs2));
        System.out.println(arrayToList(strs3));

        Integer[] nums1 = {1,2,3,4};
        Double[] nums2 = {1.0,1.1,1.2,2.4};
        Character[] chars = {'A' , 'B', 'C', '1', '2'};
        Boolean[] boo = {true,false,true,false};
        System.out.println(arrayToList(nums1));
        System.out.println(arrayToList(nums2));
        System.out.println(arrayToList(chars));
        System.out.println(arrayToList(boo));
        
    }

    public static <T> List<T> arrayToList(T[] arr){
        List<T> list = new ArrayList<>();
        for(T item : arr){
            list.add(item);
        }


        return list;
    }
}
