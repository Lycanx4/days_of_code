public class Exercises40EndsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    static boolean endsLy(String str) {
        int lastIndex = str.length();

        if (lastIndex < 2) {
            return false;
        } else {
            String s = str.substring(lastIndex - 2, lastIndex);
            if (s.equals("ly")) {
                return true;
            }
        }
        return false;
    }
}
