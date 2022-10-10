package chapter2;

public class Scanner1 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Please enter your weight : ");
        double weight = input.nextDouble();
        System.out.print("Pleasse enter your height : ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.print("Your Body Mass Index is : " + bmi);
    }
}