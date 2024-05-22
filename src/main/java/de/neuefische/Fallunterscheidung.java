package de.neuefische;

public class Fallunterscheidung {

    public static void main(String[] args) {

        boolean isLivingOnEarth = true;

        System.out.println("Hello");
        //Fallunterscheidung
        if (isLivingOnEarth){
            //Was soll ich machen wenn Aussage = true?
            System.out.println("world");
        } else {
            //"Plan B" wenn Aussage = false
            System.out.println("universe");
        }
        System.out.println("!");

        int grade = 5;
        if (grade == 1){
            System.out.println("Sehr gut!");
        } else if (grade == 2) {
            System.out.println("Gut!");
        } else if (grade == 3) {
            System.out.println("Befriedigend");
        } else if (grade == 4) {
            System.out.println("Ausreichend");
        } else if (grade == 5) {
            System.out.println("Mangelhaft");
        } else if (grade == 6) {
            System.out.println("Ungenügend");
        }else {
            System.out.println("Bitte geben Sie eine Valide Zahl zwischen 1-6 ein!");
        }

    }


}