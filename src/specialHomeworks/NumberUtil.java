package specialHomeworks;

public class NumberUtil {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int limit = 0;

        while (limit++ < 999999) {
            if (isArmstrong(limit)) {
                System.out.printf("%d sayýsý Armstrong sayýdýr.%n", limit);
            }
        }
    }

    public static boolean isArmstrong(int a) {
        return a == getDigitsPowSum(a) && a > 0;
    }

    public static int getDigitsPowSum(int a) {
        int digit = countDigits(a);
        int result = 0;

        while (a != 0) {
            result += pow(a % 10, digit);
            a /= 10;
        }
        return result;
    }

    public static int pow(int a, int b) {
        int total = 1;

        while (0 < b--)
            total *= a;

        return total;
    }

    public static int countDigits(int number) {
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }
}