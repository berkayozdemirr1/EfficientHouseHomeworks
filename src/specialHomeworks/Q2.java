package specialHomeworks;

        /*
        Parametresi ile int t�rden 3 say�dan ortancas�na geri d�nen mid isimli metodu yaz�n�z ve test ediniz.
        */

public class Q2 {
    public static void main(String[] args)
    {
        getInfo();
    }

    public static void getInfo()
    {
        System.out.println("Bu program kullan�c� taraf�ndan girilen 3 say�dan ortancas�n� geri d�nd�recektir.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("L�tfen ilk say�y� giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("L�tfen ikinci say�y� giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("L�tfen ���nc� say�y� giriniz : ");
        int sayi3 = input.nextInt();

        giveMidNumber(sayi1, sayi2, sayi3);
    }

    public static void giveMidNumber(int sayi1, int sayi2, int sayi3)
    {
        int result;
        if ((sayi3 < sayi1) && (sayi1 < sayi2) || (sayi2 < sayi1) && (sayi1 < sayi3))
            result = sayi1;
        else if ((sayi3 < sayi2) && (sayi2 < sayi1) || (sayi1 < sayi2) && (sayi2 < sayi3))
            result = sayi2;
        else result = sayi3;

        printResult(result);
    }

    public static void printResult(int result)
    {
        System.out.println("Ortanca say� : " + result);
    }
}
