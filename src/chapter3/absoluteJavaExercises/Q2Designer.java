package chapter3.absoluteJavaExercises;

public class Q2Designer
{
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String choosenChar = "";
        String previousChar = "";
        String design = "";

        System.out.println("This program help you for design of 5 stripes of color.");

        for (int i = 0; i < 5; ++i) {
            System.out.print("Please enter the color you want to choose as (R)ed, (G)reen and (B)lue : ");
            choosenChar = input.nextLine();

            if ((choosenChar.equalsIgnoreCase("r")) || (choosenChar.equalsIgnoreCase("b")) || (choosenChar.equalsIgnoreCase("g"))) {
                if (previousChar.equals(choosenChar)) {
                    System.out.println("The entered character must not be the same as the previous one. Try again");
                    i--;
                }
                else {
                    previousChar = choosenChar;
                    design += choosenChar;
                }
            }
            else {
                if (previousChar.equalsIgnoreCase(choosenChar)) {
                    System.out.println("The entered character must not be the same as the previous one. Try again");
                    i--;
                }
                else {
                    System.out.println("Just use 'r', 'b' or 'g'.");
                    i--;
                }
            }
        }
        System.out.println(design.toUpperCase());
    }
}