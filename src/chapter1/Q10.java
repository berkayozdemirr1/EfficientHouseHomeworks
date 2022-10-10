package chapter1;

public class Q10 {

    public static final int LETHAL_OVERDOSE = 10000;

    public static void main(String[] args) {
        int caffeineInCoke = 34;
        int caffeineInCoffee = 160;

        int numberOfCokeToKillPerson = LETHAL_OVERDOSE / caffeineInCoke;
        int numberOfCoffeeToKillPerson = LETHAL_OVERDOSE / caffeineInCoffee;

        System.out.println("Number of coke can it takes to kill a person : " + numberOfCokeToKillPerson);
        System.out.println("Number of coffee can it takes to kill a person : " + numberOfCoffeeToKillPerson);
    }
}