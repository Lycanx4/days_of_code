public class Exercise3GreenTicket {
    public static void main(String[] args) {
        System.out.println(greenTicket(1,2,3));
        System.out.println(greenTicket(2,2,2));
        System.out.println(greenTicket(1,1,2));
    }

    private static int greenTicket(int i, int j, int k) {
        if(i==j && j==k){
            return 20;
        }else if(i==j || j==k || i==k){
            return 10;
        }
        return 0;
    }
    
}
