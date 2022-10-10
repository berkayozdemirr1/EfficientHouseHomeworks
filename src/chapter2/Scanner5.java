package chapter2;

public class Scanner5 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Please enter your message : ");
        String mesaj = input.nextLine();
        System.out.println("Changed message is : " + mesaj.replace("hate", "love"));
    }
}
