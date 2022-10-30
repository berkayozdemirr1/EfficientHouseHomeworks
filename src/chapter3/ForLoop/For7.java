package chapter3.ForLoop;

public class For7 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Bir sayý giriniz : ");

        int val = input.nextInt();

        System.out.println(reversed(val));
    }

    public static int reversed(int val) {
        int result = 0;

        for (;val != 0;){
            result = result * 10 + val % 10;
            val /= 10;
        }return result;
    }
}
