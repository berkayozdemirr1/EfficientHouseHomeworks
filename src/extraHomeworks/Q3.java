package extraHomeworks;

        /* Parametresi ile aldýðý int türden bir sayýnýn negatif mi sýfýr mý pozitif mi olduðunu test eden signum isimli
        metodu yazýnýz ve test ediniz. Metot pozitif için "1" sýfýr için "0" negatif için "-1" döndürecektir.
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

        System.out.print("Bu program kullanýcý tarafýndan girilen sayýnýn - ya da + olduðunu bulacaktýr." +
                "- ise -1 + ise +1 0 ise 0 çýktýsý verecektir.\n" +
                "Girmek istediðiniz sayý : ");
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