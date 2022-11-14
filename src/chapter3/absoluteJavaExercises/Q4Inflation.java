package chapter3.absoluteJavaExercises;

public class Q4Inflation {
    public static void main(String[] args)
    {
        giveInfo();
    }

    public static void giveInfo ()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter the cost of product : ");
        double cost = input.nextDouble();

        System.out.print("Please enter in how many years you will buy : ");
        double year = input.nextDouble();

        System.out.print("Please enter inflation rate : ");
        double inflation = input.nextDouble();

        System.out.printf("Your product's cost %.2f with %.2f inflation rate in %.0f years later.", calculateCost(cost,year,inflation), inflation, year);
    }

    public static double calculateCost (double cost, double year, double inflation)
    {
        for (int i = 0; i < year; i++) {
            cost += inflation/100 * cost;
        }
        return cost;
    }


}