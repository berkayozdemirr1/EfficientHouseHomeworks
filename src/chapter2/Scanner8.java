package chapter2;

public class Scanner8 {

    public static final double DISTANCE = 180;

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("This program calculates vehicle average speed " +
                "given a time and distance traveled.\nPlease enter the time value : ");


        double time = input.nextDouble();
        double averageSpeed = DISTANCE / time;
        System.out.printf("Car average speed is %.2f miles per hour.", averageSpeed);
    }
}
