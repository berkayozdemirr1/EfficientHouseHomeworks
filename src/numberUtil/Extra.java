package numberUtil;

/*
        Girilen bir sayýnýn, 5'in hangi kuvvetleri arasýnda olduðu bilgisini veren bir algoritma kurun.

        Eðer sayý 5 in kuvvetiyse sadece kaçýncý kuvveti olduðunu göster. Deðilse hangi aralýk ??
*/

public class Extra {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Sayý giriniz : ");

        int val = input.nextInt();
        findPower(val);
    }

    public static void findPower(int val) {
        int number = val;
        int count = 0;
        int bolum = val / 5;

        if (val % 5 == 0 && bolum % 5 == 0) {
            while (val % 5 == 0) {
                val /= 5;
                count++;
            }
            System.out.printf("%d sayýsý 5'in %d kuvvetidir.", number, count);
        } else {
            while (val != 0) {
                val /= 5;
                count++;
            }
            System.out.printf("%d sayýsý 5'in %d kuvveti ve %d kuvveti arasýndadýr.", number, (count - 1), count);
        }
    }
}