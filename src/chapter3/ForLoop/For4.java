package chapter3.ForLoop;

public class For4 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("L�tfen say�lar� giriniz (Program� durdurmak i�in 0'a bas�n�z.)\n");

        int sumNegative = 0;
        int sumPositive = 0;
        int countNegative = 0;
        int countPositive = 0;

        for (int val; (val = input.nextInt()) != 0;) {
            if (val > 0)
            {
                sumPositive += val;
                countPositive++;
            }
            else
            {
                sumNegative += val;
                countNegative++;
            }
        }
        System.out.printf("Pozitif say�lar�n toplam� : %d%nGirilen pozitif say� adedi : %d%nNegatif say�lar�n toplam� : " +
                        "%d%nGirilen negatif say� adedi : %d"
                ,sumPositive, countPositive, sumNegative, countNegative);
    }
}