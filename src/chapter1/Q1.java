package chapter1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight : ");
        double weight = input.nextDouble();
        System.out.print("Pleasse enter your height : ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.print("Your Body Mass Index is : " + bmi);
    }
}