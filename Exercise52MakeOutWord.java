public class Exercise52MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }

    public static String makeOutWord(String outWord, String word){
        return outWord.substring(0,2) + word + outWord.substring(2,4);
    }

}
