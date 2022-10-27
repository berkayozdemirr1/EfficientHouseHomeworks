package numberUtil;
/*
        Parametresi ile aldýðý int türden bir sayýnýn basamak sayýsýný döndüren countDigits isimli metodu NumberUtil isim
    li sýnýf içerisinde yazýnýz ve aþaðýdaki kod ile test ediniz
*/

public class While5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Number : ");
        int val = input.nextInt();

        System.out.println(countDigits(val));
    }

    public static int countDigits(int val) {
        int count = 0;

        if (val != 0) {
            while (val != 0) {
                val /= 10;
                count++;
            }
        } else
            return 1;
        return count;
    }
}