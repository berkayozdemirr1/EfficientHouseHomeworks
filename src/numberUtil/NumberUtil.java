package numberUtil;

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

    public static int run(int number) {
        int digit = countDigits(number);
        int num2 = number;
        int bd = 0;
        int result = 0;

        while (num2 != 0) {
            bd = num2 % 10;
            result += pow(bd, digit);
            num2 /= 10;
        }
        return result;
    }

    public static boolean isArmstrong(int number) {
        return number == run(number) && number > 0;
    }

    public static int pow(int a, int b) {
        int total = 1;
        while (0 < b--) {
            total *= a;
        }
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