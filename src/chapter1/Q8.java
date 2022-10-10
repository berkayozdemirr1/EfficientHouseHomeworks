package chapter1;

public class Q8 {

    public static final double DISTANCE = 180;

    public static void main(String[] args) {
        double time;
        System.out.println("This program calculates vehicle average speed" +
                "given a time and distance traveled.");
        time = 20.5;
        double averageSpeed = DISTANCE / time;
        System.out.printf("Car average speed is %.2f miles per hour.", averageSpeed);
    }
}