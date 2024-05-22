package de.neuefische;

public class Methoden {

    public static void main(String[] args) {

        greetStudent("Dauren");
        greetStudent("Christopher");
        greetStudent("Juliane");
        greetStudent("Mohammed");
        greetStudent("Ursula");
        greetStudent("Marco");
        greetStudent("René");
        greetStudent("Janis");

        String solution = greetOrganism(false);
        System.out.println(solution);
    }
    //Methode
    public static void greetStudent(String name){
        System.out.println("Hallo " + name);
    }


    public static String greetOrganism(boolean isLivingOnEarth){
        String text = "Hello ";
        //Fallunterscheidung
        if (isLivingOnEarth){
            //Was soll ich machen wenn Aussage = true?
            text += "world";
        } else {
            //"Plan B" wenn Aussage = false
            text +="universe";
        }
        text +="!";

        return text;
    }
}
