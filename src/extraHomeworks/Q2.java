package extraHomeworks;

        /*
        Parametresi ile int türden 3 sayýdan ortancasýna geri dönen mid isimli metodu yazýnýz ve test ediniz.
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

        System.out.print("Bu program kullanýcý tarafýndan girilen 3 sayýdan ortancasýný geri döndürecektir.\n" +
                "Lütfen ilk sayýyý giriniz : ");
        int a = input.nextInt();

        System.out.print("Lütfen ikinci sayýyý giriniz : ");
        int b = input.nextInt();

        System.out.print("Lütfen üçüncü sayýyý giriniz : ");
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
