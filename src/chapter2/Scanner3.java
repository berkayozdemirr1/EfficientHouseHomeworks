package chapter2;

public class Scanner3 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Please enter your name : ");
        String name = input.nextLine();
        System.out.print("Please enter your surname : ");
        String surName = input.nextLine();
        System.out.println("First step : "+ name + " " + surName);
        String subName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        String subSurName = surName.substring(0,1).toUpperCase() + surName.substring(1).toLowerCase();
        System.out.println("Second step : " + subName + " " + subSurName);
        String subname2 = name.substring(1,2).toUpperCase()+name.substring(2) + name.substring(0,1) + "ay";
        String subSurName2 = surName.substring(1,2).toUpperCase()+surName.substring(2)+surName.substring(0,1) + "ay";
        System.out.println("Final : " + subname2 + " " + subSurName2);
    }
}
