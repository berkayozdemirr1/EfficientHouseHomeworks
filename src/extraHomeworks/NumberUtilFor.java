package extraHomeworks;

public class NumberUtilFor {
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        for (int index = 0; index < 99_999; ++index)
            if (isArmstrong(index))
                System.out.printf("%d sayýsý Armstrong sayýdýr.%n", index);
    }

    public static boolean isArmstrong(int a)
    {
        return a == getDigitsPowSum(a) && a > 0;
    }

    public static int getDigitsPowSum(int a)
    {
        int result = 0;

        for (int digit = countDigits(a); a != 0; a /= 10)
            result += pow(a % 10, digit);

        return result;
    }

    public static int pow(int a, int b)
    {
        int total;

        for (total =1 ; 0 < b--;)
            total *= a;

        return total;
    }

    public static int countDigits(int a)
    {
        int count = 0;

        for (; a !=0; a/= 10)
            count++;

        return count;
    }
}