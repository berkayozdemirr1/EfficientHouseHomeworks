package chapter3.absoluteJavaExercises;

public class Q1Babil {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number you want to find the square root : ");
        double n = input.nextDouble();

        System.out.printf("Square root is %.2f of number %.2f ",giveResult(n), n);
    }

    public static double giveResult(double n)
    {
        double g = n / 2;

        while (true) {
            double previousGuess = g;

            g = ((g + n / g) / 2);

            if (previousGuess - g < g / 100)
                break;
        }
        return g;
    }
}