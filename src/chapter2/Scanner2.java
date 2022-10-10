package chapter2;

public class Scanner2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter your coupon piece you have : ");
        int coupon = input.nextInt();
        int candy = coupon / 10;
        int remainingCoupon = coupon - candy * 10;
        int gumball = remainingCoupon / 3;
        remainingCoupon = remainingCoupon - gumball * 3;

        System.out.println("Buys Candies : " + candy);
        System.out.println("Buys Gumballs : " + gumball);
        System.out.println("Remaining Coupons : " + remainingCoupon);
    }
}
