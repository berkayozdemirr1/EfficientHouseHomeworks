package extraHomeworks;

        /* Parametresi ile ald��� int t�rden bir say�n�n negatif mi s�f�r m� pozitif mi oldu�unu test eden signum isimli
        metodu yaz�n�z ve test ediniz. Metot pozitif i�in "1" s�f�r i�in "0" negatif i�in "-1" d�nd�recektir.
         */

public class Q3
{
    public static void main(String[] args)
    {
        getInfo();
    }

    public static void getInfo()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Bu program kullan�c� taraf�ndan girilen say�n�n - ya da + oldu�unu bulacakt�r." +
                "- ise -1 + ise +1 0 ise 0 ��kt�s� verecektir.\n" +
                "Girmek istedi�iniz say� : ");
        int sayi1 = input.nextInt();

        signum(sayi1);
    }

    public static void signum(int sayi1)
    {
        if (sayi1 < 0)
            System.out.print("-1");
        else if (sayi1 > 0)
            System.out.println("+1");
        else
            System.out.println("0");
    }
}