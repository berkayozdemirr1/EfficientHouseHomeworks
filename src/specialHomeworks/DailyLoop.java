package specialHomeworks;

public class DailyLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Malcolm Gladwell'e g�re; temel olarak bir konuda uzman olabilmek i�in toplamda 10 bin saat\n" +
                "o konu �zerinde �al���lmas� gerekmektedir. Sen tahmini ka� saat �al��t�n :");
        int success = input.nextInt();
        while (success++ < 10000) {
            int remainForSuccess = 10000 - success;
            System.out.printf("%d saat �al��mal�s�n.%n", remainForSuccess);
        }if (success > 10000)
            System.out.println("Ba�armak compiler kadar h�zl� olmuyor. Unutma. Ad�m ad�m ilerlemelisin.");
    }
}