package chapter3.whileDoWhile;

/*
Klavyeden sifir girilene kadar girilen degerleri pozitif ve negatif olarak toplayip kacar tane girildigin ekrana bastir.
*/

 // Bu algoritmay� sonsuz d�ng�yle kur.

public class While4 {
    public static void main(String[] args) {
        run();
    }

    public static void run () {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int val;
        int sumNegative = 0;
        int sumPositive = 0;
        int countNegative = 0;
        int countPositive = 0;

        while ((val = input.nextInt()) != 0) {
            if (val < 0) {
                sumNegative += val;
                countNegative++;
            } else {
                sumPositive += val;
                countPositive++;
            }
        }
        display(sumPositive,sumNegative,countPositive,countNegative);
    }

    public static void display (int sumPositive, int sumNegative, int countPositive, int countNegative) {
        System.out.printf("Pozitif say�lar�n toplam� : %d%nGirilen pozitif say� adedi : %d%nNegatif say�lar�n toplam� : " +
                        "%d%nGirilen negatif say� adedi : %d"
                ,sumPositive, countPositive, sumNegative, countNegative);
    }
}