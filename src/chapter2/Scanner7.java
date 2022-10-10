package chapter2;

public class Scanner7 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter the seconds : ");

        int seconds = input.nextInt();

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}
