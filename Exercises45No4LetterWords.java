//odd only

import java.util.ArrayList;
import java.util.List;

public class Exercises45No4LetterWords{
    public static void main(String[]args){
        String[] strs1 = {"Train", "Boat", "Car"} ;
        String[] strs2 = {"Red", "White", "Blue"} ;

        System.out.println("List 1: " + No4LetterWords(strs1));
        System.out.println("List 2: " + No4LetterWords(strs2));

    }
    static List<String> No4LetterWords(String[] strs){
        List<String> result = new ArrayList<String>();
        for (String str : strs) {
            if(str.length() != 4){
                result.add(str);
            }
        }
        return result;
    }
}

