package chapter1;

public class Q2 {
    public static void main(String[] args) {
        int coupon = 144;
        int candy = coupon / 10;
        int remainingCoupon = coupon - candy * 10;
        int gumball = remainingCoupon / 3;
        remainingCoupon = remainingCoupon - gumball * 3;

        System.out.println("Buys Candies : " + candy);
        System.out.println("Buys Gumballs : " + gumball);
        System.out.println("Remaining Coupons : " + remainingCoupon);
    }
}