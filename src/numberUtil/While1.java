package numberUtil;

public class While1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Ka� defa d�ncen :");
        int n = input.nextInt();

        int j = 1;

        while (j <= n) {
            System.out.printf("%d kere d�nd�m.%n" , j);
            ++j;
        }
        System.out.println("+++++++++++++++++");

        int i = 0; // iteratif kullan�m

        while (i < n) {
            System.out.print(i + " ");
        }
        System.out.println(i);

        //i de�i�kenini de�i�tirip debugla.
    }
}