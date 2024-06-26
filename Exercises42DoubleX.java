public class Exercises42DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));

    }

    static boolean doubleX(String str) {

        // one way
        // if(str.contains("xx")){
        // return true;
        // }

        // or another
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                return true;
            }
        }

        return false;
    }

}
