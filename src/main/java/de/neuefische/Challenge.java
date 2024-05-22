package de.neuefische;

public class Challenge {

    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1.1,2.9));

        System.out.println(makePositive(-5));
    }

    //Method Overloading
    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int makePositive(int num){
        if (num < 0){
            return -num;
        }
        return num;
    }
}
