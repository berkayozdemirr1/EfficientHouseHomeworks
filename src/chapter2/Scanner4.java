package chapter2;

public class Scanner4 {

    public static final double SWEETENER_FRACTION = 0.001;

    public static void main(String[] args) {

        final double amountSweetenerToKillMice = 0.00013;
        final double weightOfMice = 0.2;

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter your weight : ");
        double weightOfDieter = input.nextDouble();
        System.out.print("Please enter your desired weight : ");
        double desiredWeightofDieter = input.nextDouble();


        int safeUseSoda = (int) (((amountSweetenerToKillMice / weightOfMice) * desiredWeightofDieter) / SWEETENER_FRACTION);

        System.out.println("To lose " + (weightOfDieter - desiredWeightofDieter) + " kg ");
        System.out.println("Safe soda limit to have : " + safeUseSoda);
    }
}
