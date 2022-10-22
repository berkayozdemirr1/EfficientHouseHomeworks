package specialHomeworks;

        /*
        Parametresi ile int türden 3 sayýdan ortancasýna geri dönen mid isimli metodu yazýnýz ve test ediniz.
        */

public class Q2 {
    public static void main(String[] args)
    {
        getInfo();
    }

    public static void getInfo()
    {
        System.out.println("Bu program kullanýcý tarafýndan girilen 3 sayýdan ortancasýný geri döndürecektir.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Lütfen ilk sayýyý giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen ikinci sayýyý giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("Lütfen üçüncü sayýyý giriniz : ");
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
        System.out.println("Ortanca sayý : " + result);
    }
}
