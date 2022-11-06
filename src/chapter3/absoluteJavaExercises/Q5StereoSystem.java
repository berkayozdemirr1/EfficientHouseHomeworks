package chapter3.absoluteJavaExercises;

public class Q5StereoSystem
{
    public static void main(String[] args)
    {
        double principal = 1000;
        double interestRate = 1.5;
        int count = 0;
        double totalInterestPaid = 0;
        double payable = 50;
        double interestAmount;


        while (principal > 0) {
            totalInterestPaid += principal / 100 * interestRate;
            interestAmount = principal / 100 * interestRate;
            payable -= interestAmount;
            principal -= payable;
            payable = 50;
            count++;
        }
        System.out.printf("Aldýðýnýz ses sistemi için ödediðiniz toplam faiz miktarý : %.2f%n" +
                "Ödeme yaptýðýnýz ay sayýsý : %d", totalInterestPaid, count);
    }
}