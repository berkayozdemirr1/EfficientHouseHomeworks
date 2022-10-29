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
        System.out.printf("Pozitif sayýlarýn toplamý : %d%nNegatif sayýlarýn toplamý : %d", sumPositive, sumNegative);
    }
}

// Aþama aþama gideceksin. Her þeyi bi anda anlayamazsýn. Eðer problemi parçalara bölmezsen YAPAMAZSIN.