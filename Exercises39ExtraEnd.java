public class Exercises39ExtraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }

    static String extraEnd(String str) {
        int lastIndex = str.length();
        String s = str.substring(lastIndex - 2, lastIndex);
        return s + s + s;
    }
}
