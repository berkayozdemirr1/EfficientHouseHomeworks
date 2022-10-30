package chapter3.whileDoWhile;

/*
    Girilen sayýnýn basamaklarýný topla.
*/

public class While6 {
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
        int total = 0;

        while (val > 0) {
            total += val % 10;
            val /= 10;
        }
        return total;
    }
}