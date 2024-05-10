import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Exercises43ReverseList{
    public static void main(String[]args){
        List<String> strs1 = new ArrayList<>( Arrays.asList("purple", "green", "blue", "yellow", "green" ));
        List<String> strs2 = new ArrayList<>( Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"));
        System.out.println("List 1: " + reverseList(strs1));
        System.out.println("List 2: " + reverseList(strs2));

    }
    static List<String> reverseList(List<String> strs){
        List<String> result = new ArrayList<String>();
        Stack<String> stackList = new Stack<>();
        stackList.addAll(strs);

        while(!stackList.empty()){
            result.add(stackList.pop());
        }

        return result;
    }
}

