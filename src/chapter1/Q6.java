package chapter1;

public class Q6 {
    public static void main(String[] args) {
        double princiAmount = 1000;
        double intRate = 0.05;
        double year = 5;
        double interest = (princiAmount * intRate * year) / 100;

        System.out.println("interest : " + interest);
    }
}