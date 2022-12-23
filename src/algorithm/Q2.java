package algorithm;

public class Q2 {
    public static void main(String[] args)
    {
        getSeconds();
    }

    public static void getSeconds()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Saniye türünden bir deðer giriniz = ");

        long seconds = input.nextLong();

        displayDuration(seconds);
    }

    public static void displayDuration(long seconds)
    {
        long hours = seconds / 3600;
        seconds %= 3600;

        long minutes = seconds / 60;
        seconds %= 60;

        String hour = hours != 0 ? hours + " saat " : "";
        String minute = minutes != 0 ? minutes + " dakika " : "";
        String second = seconds != 0 ? seconds + " saniye " : "";

        System.out.println(hour + minute + second);
    }
}