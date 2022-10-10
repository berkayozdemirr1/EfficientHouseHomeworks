package chapter2;

public class Scanner6 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);


        System.out.print("Please enter principal amount : ");
        double princiAmount = input.nextDouble();
        System.out.print("Please enter interest rate : ");
        double intRate = input.nextDouble();
        System.out.print("Please enter year you worked : ");
        double year = input.nextDouble();

        double interest = (princiAmount * intRate * year) / 100;

        System.out.println("interest : " + interest);
    }
}
