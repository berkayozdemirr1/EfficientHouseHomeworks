package numberUtil;

/*
        Girilen bir say�n�n, 5'in hangi kuvvetleri aras�nda oldu�u bilgisini veren bir algoritma kurun.

        E�er say� 5 in kuvvetiyse sadece ka��nc� kuvveti oldu�unu g�ster. De�ilse hangi aral�k ??
*/

public class Extra {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Say� giriniz : ");

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
            System.out.printf("%d say�s� 5'in %d kuvvetidir.", number, count);
        } else {
            while (val != 0) {
                val /= 5;
                count++;
            }
            System.out.printf("%d say�s� 5'in %d kuvveti ve %d kuvveti aras�ndad�r.", number, (count - 1), count);
        }
    }
}