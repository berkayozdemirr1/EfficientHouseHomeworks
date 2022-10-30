package extraHomeworks;

public class PrimeNumber {
    public static void main(String[] args)
    {
        test();
    }

    public static void test()
    {
        for (long a = 0; a < 99_999; a++) {
            if (isPrime(a))
                System.out.printf("%d is a prime number.%n", a);
       }
    }

    public static boolean isPrime(long val)
    {
        if (val < 2)
            return false;
        if (val % 2 == 0)
            return val == 2;

        for (long i = 3; i < val / 2 ; i += 2) {
            if (val % i == 0)
                return false;
        }
        return true;
    }
}