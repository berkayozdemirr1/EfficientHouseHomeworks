package chapter2;

public class Scanner10 {

    public static final int LETHAL_OVERDOSE = 10000;

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter caffeine value in coke : ");
        int caffeineInCoke = input.nextInt();
        int numberOfCokeToKillPerson = LETHAL_OVERDOSE / caffeineInCoke;
        System.out.println("Number of coke can it takes to kill a person : " + numberOfCokeToKillPerson);

        System.out.print("Please enter caffeine value in coffee : ");
        int caffeineInCoffee = input.nextInt();
        int numberOfCoffeeToKillPerson = LETHAL_OVERDOSE / caffeineInCoffee;
        System.out.println("Number of coffee can it takes to kill a person : " + numberOfCoffeeToKillPerson);
    }
}
