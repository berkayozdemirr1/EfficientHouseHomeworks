package chapter2;

public class Scanner9 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int minimumWeight = 110;
        System.out.print("Please enter your height : ");
        int heightFt = input.nextInt();
        int heightInch = heightFt * 12;
        int bodyWeight = minimumWeight + (heightInch % 60) * 5;

        System.out.printf("Height = %d(ft) = Ideal body weight : %d(pound)", heightFt, bodyWeight);
    }
}
