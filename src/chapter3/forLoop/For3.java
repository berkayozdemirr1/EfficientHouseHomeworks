package chapter3.forLoop;

public class For3 {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Lütfen sayýlarý giriniz (Programý durdurmak için 0'a basýnýz.)\n");

        int sumPositive = 0;
        int sumNegative = 0;

        for (int val; (val = input.nextInt()) != 0;)
        {
            if (val > 0)
                sumPositive += val;
            else
                sumNegative += val;
        }
        System.out.printf("Girilen pozitif sayýlarýn toplamý : %d%n" +
                          "Girilen negatif sayýlarýn toplamý : %d" ,
                           sumPositive, sumNegative);
    }
}
// for ((initialization) ; (boolean expression) ; (update))
// {
//      Body;
// }