import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises49DistinctValues {
    public static void main(String[] args) {
        List<String> strs1 = Arrays.asList("red", "yellow", "green", "yellow", "blue", "green", "purple");
        List<String> strs2 = Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way");

        System.out.println(distinctValues(strs1));
        System.out.println(distinctValues(strs2));

    }

    public static List<String> distinctValues(List<String> strs) {
        List<String> result = new ArrayList<>();
        for (String str : strs) {
            if (!result.contains(str)) {
                result.add(str);
            }
        }
        return result;
    }
}
