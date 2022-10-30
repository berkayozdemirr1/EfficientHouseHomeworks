package chapter3.ForLoop;

public class For6 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Bir sayý giriniz : ");

        int val = input.nextInt();

        System.out.printf("%d sayýsýnýn basamaklarý toplamý %d", val, sumDigits(val));
    }

    public static int sumDigits(int val)
    {
        int sum = 0;

        for (; val != 0; val /= 10) {
            sum += val % 10;
        }
        return sum;
    }
}