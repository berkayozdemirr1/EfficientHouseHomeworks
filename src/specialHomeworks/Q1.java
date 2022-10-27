package specialHomeworks;

        /*
        1) Klavyeden al�nan int t�rden �� say� aras�ndaki b�y�kl�k-k���kl�k ili�kisini k���kten b�y��e do�ru < ve = sem-
        bolleriyle g�steriniz.

        A��klama : Program �� tane int t�rden say� isteyecek, aralar�ndaki ili�kiyi ekranda g�sterecek. �rn:

        Giri� : 10, 20, 30
        Yan�t : 10 < 20 = 20


        �S�MLEND�RMELERE D�KKAT ED�LECEK !

         */


public class Q1
{
    public static void main(String[] args)
    {
        getInfo();
    }

    public static void getInfo()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Bu program kullan�c� taraf�ndan girilen 3 say�y� k���kten b�y��e g�re s�ralar.\n" +
                "L�tfen ilk say�y� giriniz : ");
        int a = input.nextInt();

        System.out.print("L�tfen ikinci say�y� giriniz : ");
        int b = input.nextInt();

        System.out.print("L�tfen ���nc� say�y� giriniz : ");
        int c = input.nextInt();

        sorting(a, b, c);

    }

    public static int enKucuk(int a, int b, int c)
    {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        return c;
    }

    public static int enBuyuk(int a, int b, int c)
    {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        return c;
    }

    public static void sorting(int a, int b, int c)
    {
        int min = enKucuk(a, b, c);
        int max = enBuyuk(a, b, c);
        int mid = (a + b + c) - (max + min);

        display(min, mid, max);
    }

    public static void display (int min, int mid, int max)
    {
        if (min < mid)
            System.out.printf("%d < %d ", min, mid);
        else
            System.out.printf("%d = %d ", min, mid);

        if (mid < max)
            System.out.printf("< %d", max);
        else
            System.out.printf("= %d", max);
    }
}