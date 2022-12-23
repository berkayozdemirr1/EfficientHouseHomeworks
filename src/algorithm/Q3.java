package algorithm;

public class Q3 {
    public static void main(String[] args)
    {
        run(12);
    }

    public static void run (int sayi)
    {
        int bolen = 2;
        while (sayi >= bolen) {
            if (sayi % bolen == 0) {
                sayi /= bolen;
                System.out.printf("%d " , bolen);
            }
            else bolen++;
        }
    }
}