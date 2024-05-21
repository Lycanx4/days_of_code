import java.util.HashMap;

public class Exercise52MakeOutWord {
    public static void main(String[] args) {

        HashMap<String,String> myMap = new HashMap<>();
        myMap.put("Yay", "<<>>");
        myMap.put("WooHoo", "<<>>");
        myMap.put("word", "[[]]");

        extracted(myMap);

    }

    private static void extracted(HashMap<String, String> myMap) {
        myMap.forEach((key,value)-> System.out.println(makeOutWord(value, key)));
    }

    public static String makeOutWord(String outWord, String word){
        return outWord.substring(0,2) + word + outWord.substring(2,4);
    }

}
