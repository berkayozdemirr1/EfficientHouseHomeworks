package chapter3.absoluteJavaExercises;

public class Q3GravitationalForce {
    public static void main(String[] args) {
        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("This program will calculate your car's weight in the world or moon.\n" +
                           "Press '0' to escape to program");

        double weight;

        do {
            System.out.print("Enter the weight of your car : ");
            weight = input.nextInt();

            if (weight != 0) {

                System.out.print("1) Calculate for moon\n" +
                        "2) Calculate for world\n" +
                        "Make your choise : ");
                int worldOrMoon = input.nextInt();

                if (worldOrMoon == 1)
                    System.out.printf("Your car's weight is %.2f N%n", calculateForMoon(weight));
                else if (worldOrMoon == 2)
                    System.out.printf("Your car's weight is %.2f N%n", calculateForEarth(weight));
                else
                    System.out.println("Geçerli bir deðer giriniz.");

            }else System.out.println("Program is end.");

        }while (weight != 0);
    }

    public static double calculateForEarth(double weight) {
        return weight * 9.81;
    }

    public static double calculateForMoon(double weight) {
        return weight * 1.64;
    }
}