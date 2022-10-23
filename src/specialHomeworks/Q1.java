package specialHomeworks;

        /*
        1) Klavyeden alýnan int türden üç sayý arasýndaki büyüklük-küçüklük iliþkisini küçükten büyüðe doðru < ve = sem-
        bolleriyle gösteriniz.

        Açýklama : Program üç tane int türden sayý isteyecek, aralarýndaki iliþkiyi ekranda gösterecek. Örn:

        Giriþ : 10, 20, 30
        Yanýt : 10 < 20 = 20
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

        System.out.print("Bu program kullanýcý tarafýndan girilen 3 sayýyý küçükten büyüðe göre sýralar.\n" +
                "Lütfen ilk sayýyý giriniz : ");
        int a = input.nextInt();

        System.out.print("Lütfen ikinci sayýyý giriniz : ");
        int b = input.nextInt();

        System.out.print("Lütfen üçüncü sayýyý giriniz : ");
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
        int mid = (a + b + c) - (enBuyuk(a, b, c) + enKucuk(a, b, c));

        System.out.print(enKucuk(a, b, c) + " " + mid + " " + enBuyuk(a, b, c));
    }
}