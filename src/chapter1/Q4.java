package chapter1;

public class Q4 {
    public static void main(String[] args) {
        int seconds = 36789;

        int hours = seconds / 3600;
        seconds %= 3600;

        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}