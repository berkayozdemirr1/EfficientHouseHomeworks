package chapter3.whileDoWhile;

public class While7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");

        int val = input.nextInt();

        System.out.println(reversed(val));
    }

    public static int reversed(int val) {
        int result = 0;

        while (val > 0) {
            result = result * 10 + val % 10;
            val /= 10;
        }
        return result;
    }
}