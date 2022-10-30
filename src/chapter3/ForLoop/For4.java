package chapter3.ForLoop;

public class For4 {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Lütfen sayýlarý giriniz (Programý durdurmak için 0'a basýnýz.)\n");

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
        System.out.printf("Pozitif sayýlarýn toplamý : %d%nGirilen pozitif sayý adedi : %d%nNegatif sayýlarýn toplamý : " +
                        "%d%nGirilen negatif sayý adedi : %d"
                ,sumPositive, countPositive, sumNegative, countNegative);
    }
}