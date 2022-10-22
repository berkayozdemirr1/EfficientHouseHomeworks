package specialHomeworks;

        /*
        1) Klavyeden alýnan int türden üç sayý arasýndaki büyüklük-küçüklük iliþkisini küçükten büyüðe doðru < ve = sem-
        bolleriyle gösteriniz.

        Açýklama : Program üç tane int türden sayý isteyecek, aralarýndaki iliþkiyi ekranda gösterecek. Örn:

        Giriþ : 10, 20, 30
        Yanýt : 10 < 20 < 30
         */


public class Q1 {
    public static void main(String[] args)
    {
        getInfo();
    }

    public static void getInfo()
    {
        System.out.println("Bu program kullanýcý tarafýndan girilen 3 sayýyý küçükten büyüðe göre sýralar.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Lütfen ilk sayýyý giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen ikinci sayýyý giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("Lütfen üçüncü sayýyý giriniz : ");
        int sayi3 = input.nextInt();
    }


}