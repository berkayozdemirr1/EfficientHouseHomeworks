package chapter3.forLoop;

public class For1 {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Ka� defa d�nmek istiyon : ");

        int val = input.nextInt();

        for (int i = 1; i <= val; ++i)
            System.out.printf("%d defa d�nd�m%n", i);

        System.out.println("++++++++++++++++++++++");

        int i;

        for (i = 0; i < val; ++i)
            System.out.printf("%d ", i);

        System.out.printf("D�ng�den ��kt�m ve son de�erim %d", i);
    }
}
