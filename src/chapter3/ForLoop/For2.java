package chapter3.ForLoop;

public class For2 {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Kaç defa dönecen : ");

        int val = input.nextInt();

        for (int i = 0; val > 0; --val){
            System.out.println(val);
        }
    }
}
