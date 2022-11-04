package chapter3.absoluteJavaExercises;

public class Q7Armstrong {
    public static void main(String[] args)
    {
        giveNumbers();
    }

    public static void giveNumbers()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        do {
            System.out.print("Please enter the first number : ");
            int firstNumber = input.nextInt();

            System.out.print("Please enter the last number : ");
            int lastNumber = input.nextInt();

            loop(firstNumber, lastNumber);

            System.out.print("For exit press '0'\n" +
                             "For continue press '1'\n" +
                             "Your answer is : ");

        } while (input.nextInt() != 0);
    }

    public static void loop(int firstNumber, int lastNumber)
    {
        while (firstNumber++ <= lastNumber) {
            if (isArmstrong(firstNumber))
                System.out.printf("%d sayýsý Armstrong sayýdýr.%n", firstNumber);
        }
    }

    public static boolean isArmstrong(int a)
    {
        return a == getDigitsPowSum(a) && a > 0;
    }

    public static int getDigitsPowSum(int a)
    {
        int digit = countDigits(a);
        int result = 0;

        while (a != 0) {
            result += pow(a % 10, digit);
            a /= 10;
        }
        return result;
    }

    public static int pow(int a, int b)
    {
        int total = 1;

        while (0 < b--)
            total *= a;

        return total;
    }

    public static int countDigits(int number)
    {
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }
}