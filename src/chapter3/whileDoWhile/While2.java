package chapter3.whileDoWhile;

/*
    Kullan�c�dan al�nan veriye g�re d�ng� olu�tur.
*/

public class While2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Ka� defa d�ncen : ");
        int n = input.nextInt();

        int i = 0;

        while (i < n--) {
            System.out.println(n); // 2 1 0
        }
    }
}