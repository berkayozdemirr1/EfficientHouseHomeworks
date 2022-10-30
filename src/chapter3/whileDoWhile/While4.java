package chapter3.whileDoWhile;

/*
Klavyeden sifir girilene kadar girilen degerleri pozitif ve negatif olarak toplayip kacar tane girildigin ekrana bastir.
*/

 // Bu algoritmayý sonsuz döngüyle kur.

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
        System.out.printf("Pozitif sayýlarýn toplamý : %d%nGirilen pozitif sayý adedi : %d%nNegatif sayýlarýn toplamý : " +
                        "%d%nGirilen negatif sayý adedi : %d"
                ,sumPositive, countPositive, sumNegative, countNegative);
    }
}