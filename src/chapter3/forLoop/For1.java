package chapter3.forLoop;

public class For1 {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Kaç defa dönmek istiyon : ");

        int val = input.nextInt();

        for (int i = 1; i <= val; ++i)
            System.out.printf("%d defa döndüm%n", i);

        System.out.println("++++++++++++++++++++++");

        int i;

        for (i = 0; i < val; ++i)
            System.out.printf("%d ", i);

        System.out.printf("Döngüden çýktým ve son deðerim %d", i);
    }
}
