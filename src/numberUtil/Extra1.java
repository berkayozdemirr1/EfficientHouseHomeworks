package numberUtil;

public class Extra1 {
    public static void main(String[] args) {
        System.out.println(pow(4,3));
    }

    public static int pow (int a, int b) {
        int total = 1;
        while (0 < b--) {
            total *= a;
        }return total;
    }

}
