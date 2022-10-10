package chapter1;

public class Q8 {

    public static final double SWEETENER_FRACTION = 0.001;

    public static void main(String[] args) {

        final double amountSweetenerToKillMice = 0.00013;
        final double weightOfMice = 0.2;

        double weightOfDieter = 100;
        double desiredWeightofDieter = 80;


        int safeUseSoda = (int) (((amountSweetenerToKillMice / weightOfMice) * desiredWeightofDieter) / SWEETENER_FRACTION);

        System.out.println("To lose " + (weightOfDieter - desiredWeightofDieter) + " kg ");
        System.out.println("Safe soda limit to have : " + safeUseSoda);
    }
}