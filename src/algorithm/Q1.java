package algorithm;

public class Q1 {
    public static void main(String[] args)
    {
        getRange();
    }

    public static void getRange()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Bir sayý giriniz = ");

        int range = input.nextInt();

        displaySquare(range);
    }

    public static void displaySquare(int range)
    {
        for (int i = 0; i < range; ++i) {
            for (int j = 0; j < range; j++) {
                if (i == 0 || i == range -1 || j == 0 || j == range -1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}