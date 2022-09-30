package chapter1;

public class Q9 {
    public static void main(String[] args) {
        String name = "berkay";
        String surName = "özdemir";
        System.out.println(name + " " + surName);
        String subName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        String subSurName = surName.substring(0,1).toUpperCase() + surName.substring(1).toLowerCase();
        System.out.println(subName + " " + subSurName);
        String subname2 = name.substring(1,2).toUpperCase()+name.substring(2) + name.substring(0,1) + "ay";
        String subSurName2 = surName.substring(1,2).toUpperCase()+surName.substring(2)+surName.substring(0,1) + "ay";
        System.out.println(subname2 + " " + subSurName2);
    }
}