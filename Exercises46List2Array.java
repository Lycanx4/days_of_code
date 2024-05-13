import java.util.Arrays;
import java.util.List;

public class Exercises46List2Array{
    public static void main(String[]args){
        List<String> strs1 = Arrays.asList("aa", "ab", "ac");
        List<String> strs2 = Arrays.asList("as", "df", "jk");
        List<String> strs3 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        System.out.println("Array 1: " + Arrays.toString(list2Array(strs1)));
        System.out.println("Array 1: " + Arrays.toString(list2Array(strs2)));
        System.out.println("Array 1: " + Arrays.toString(list2Array(strs3)));
    }

    static String[] list2Array(List<String> strs){
        int size = strs.size();
        String[] strArr = new String[size];
        for(int i=0; i< size; i++){
            strArr[i] = strs.get(i);
        }
        return strArr;
    }
}

