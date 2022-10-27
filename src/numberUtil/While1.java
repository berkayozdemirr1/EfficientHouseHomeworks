package numberUtil;

public class While1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Kaç defa döncen :");
        int n = input.nextInt();

        int j = 1;

        while (j <= n) {
            System.out.printf("%d kere döndüm.%n" , j);
            ++j;
        }
        System.out.println("+++++++++++++++++");

        int i = 0; // iteratif kullaným

        while (i < n) {
            System.out.print(i + " ");
        }
        System.out.println(i);

        //i deðiþkenini deðiþtirip debugla.
    }
}