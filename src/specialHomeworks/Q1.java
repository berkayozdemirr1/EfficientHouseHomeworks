package specialHomeworks;

        /*
        1) Klavyeden al�nan int t�rden �� say� aras�ndaki b�y�kl�k-k���kl�k ili�kisini k���kten b�y��e do�ru < ve = sem-
        bolleriyle g�steriniz.

        A��klama : Program �� tane int t�rden say� isteyecek, aralar�ndaki ili�kiyi ekranda g�sterecek. �rn:

        Giri� : 10, 20, 30
        Yan�t : 10 < 20 < 30
         */


public class Q1 {
    public static void main(String[] args)
    {
        getInfo();
    }

    public static void getInfo()
    {
        System.out.println("Bu program kullan�c� taraf�ndan girilen 3 say�y� k���kten b�y��e g�re s�ralar.");
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("L�tfen ilk say�y� giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("L�tfen ikinci say�y� giriniz : ");
        int sayi2 = input.nextInt();
        System.out.print("L�tfen ���nc� say�y� giriniz : ");
        int sayi3 = input.nextInt();
    }


}