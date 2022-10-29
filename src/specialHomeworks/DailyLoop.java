package specialHomeworks;

public class DailyLoop {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Malcolm Gladwell'e göre; temel olarak bir konuda uzman olabilmek için toplamda 10 bin saat\n" +
                "o konu üzerinde çalýþýlmasý gerekmektedir. Sen tahmini kaç saat çalýþtýn :");
        int success = input.nextInt();
        while (success++ < 10000) {
            int remainForSuccess = 10000 - success;
            System.out.printf("%d saat çalýþmalýsýn.%n", remainForSuccess);
        }if (success > 10000)
            System.out.println("Baþarmak compiler kadar hýzlý olmuyor. Unutma. Adým adým ilerlemelisin.");
    }
}