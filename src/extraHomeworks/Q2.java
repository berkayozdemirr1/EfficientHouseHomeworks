package extraHomeworks;

        /*
        Parametresi ile int t�rden 3 say�dan ortancas�na geri d�nen mid isimli metodu yaz�n�z ve test ediniz.
        */

public class Q2
{
    public static void main(String[] args)
    {
        getInfo();
    }

    static void getInfo()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Bu program kullan�c� taraf�ndan girilen 3 say�dan ortancas�n� geri d�nd�recektir.\n" +
                "L�tfen ilk say�y� giriniz : ");
        int a = input.nextInt();

        System.out.print("L�tfen ikinci say�y� giriniz : ");
        int b = input.nextInt();

        System.out.print("L�tfen ���nc� say�y� giriniz : ");
        int c = input.nextInt();

        System.out.print(giveMidNumber(a, b, c));
    }

    static int giveMidNumber(int a, int b, int c)
    {
        if ((c <= a && a <= b) || (b <= a && a <= c))
            return a;
        else if ((c <= b) && (b <= a) || (a <= b) && (b <= c))
            return b;
        return c;
    }
}
