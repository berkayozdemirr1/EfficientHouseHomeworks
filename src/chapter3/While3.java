package chapter3;

/*
    Klavyeden sifir girilene kadar girilen degerleri pozitif ve negatif olarak toplayip ekrana bastir.
 */

public class While3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Sayi giriniz : ");

        int val;
        int sumPositive = 0;
        int sumNegative = 0;

        while (true) {

            val = input.nextInt();

            if (val == 0) {
                display(sumPositive, sumNegative);
                return;
            }
            if (val > 0) {
                sumPositive += val;
            } else
                sumNegative += val;
        }

    }

    public static void display(int sumPositive, int sumNegative) {
        System.out.printf("Pozitif say�lar�n toplam� : %d%nNegatif say�lar�n toplam� : %d", sumPositive, sumNegative);
    }
}

// A�ama a�ama gideceksin. Her �eyi bi anda anlayamazs�n. E�er problemi par�alara b�lmezsen YAPAMAZSIN.