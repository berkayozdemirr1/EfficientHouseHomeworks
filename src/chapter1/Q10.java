package chapter1;

public class Q10 {
    public static void main(String[] args) {
        int minimumWeight = 110;
        int heightFt = 7;
        int heightInch = heightFt * 12;
        int bodyWeight = minimumWeight + (heightInch % 60) * 5;

        System.out.printf("Height = %d(ft) = Ideal body weight : %d(pound)", heightFt, bodyWeight);
    }
}