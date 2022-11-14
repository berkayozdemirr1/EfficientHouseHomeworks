package chapter3.absoluteJavaExercises;

public class Q3GravitationalForce {
    public static void main(String[] args) {
        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("This program will calculate your car's weight in the world or moon.\n" +
                           "Press '0' to quit to program");

        while (true) {
            double weight;

            System.out.print("Enter the weight of your car : ");
            weight = input.nextDouble();

            if (weight > 0) {

                System.out.print("1) Calculate for moon\n" +
                        "2) Calculate for world\n" +
                        "Make your choise : ");
                int worldOrMoon = input.nextInt();

                if (worldOrMoon == 1) {
                    weight *= 9.81 / 6;
                    System.out.printf("Your car's weight is %.2f N%n", weight);
                } else if (worldOrMoon == 2) {
                    weight *= 9.81;
                    System.out.printf("Your car's weight is %.2f N%n", weight);
                } else
                    System.out.println("Enter the valid value.");
            }
            else if (weight < 0)
                System.out.println("Mass shouldn't be a negative value");
            else {
                System.out.print("Good bye.");
                break;
            }
        }
    }
}