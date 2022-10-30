package chapter3.whileDoWhile;

/*
    Kullanýcýdan alýnan veriye göre döngü oluþtur.
*/

public class While2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Kaç defa döncen : ");
        int n = input.nextInt();

        int i = 0;

        while (i < n--) {
            System.out.println(n); // 2 1 0
        }
    }
}