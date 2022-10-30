package chapter3.whileDoWhile;

public class While1 {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Turning times :");
        int n = input.nextInt();

        int j = 1;

        while (j <= n)
        {
            System.out.printf("%d times i turned.%n" , j);
            ++j;
        }
        System.out.println("+++++++++++++++++");

        int i = 0; // iteratif kullaným

        while (i < n)
            System.out.print(i + " ");

        System.out.println(i);


    }
}