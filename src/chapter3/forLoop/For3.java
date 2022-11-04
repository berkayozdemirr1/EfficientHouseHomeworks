package chapter3.forLoop;

public class For3 {
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("L�tfen say�lar� giriniz (Program� durdurmak i�in 0'a bas�n�z.)\n");

        int sumPositive = 0;
        int sumNegative = 0;

        for (int val; (val = input.nextInt()) != 0;)
        {
            if (val > 0)
                sumPositive += val;
            else
                sumNegative += val;
        }
        System.out.printf("Girilen pozitif say�lar�n toplam� : %d%n" +
                          "Girilen negatif say�lar�n toplam� : %d" ,
                           sumPositive, sumNegative);
    }
}
// for ((initialization) ; (boolean expression) ; (update))
// {
//      Body;
// }