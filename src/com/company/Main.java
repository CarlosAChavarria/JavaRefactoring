package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner console = new Scanner( System.in);
    public static void main(String[] args) {
        int num1 = number1("addition");
        int num2 = number2("addition");
        int addition = num1 + num2;
        System.out.println( num1+" + "+num2+" = "+ addition);

        num1 = number1("subtraction");
        num2 = number2("subtraction");
        int subtraction = num1 - num2;
        System.out.println( num1+" - "+num2+" = "+ subtraction);

        num1 = number1("multiplication");
        num2 = number2("multiplication");
        int multiplication = num1 * num2;
        System.out.println( num1+" * "+num2+" = "+ multiplication);

        num1 = number1("division");
        num2 = number2("division");
        double division = (double)num1 / num2;
        System.out.println( num1+" / "+num2+" = "+ division);
        console.close();
    }

    public static int number1(String operation){
        System.out.print("Enter " +operation+ " number 1  ");
        return console.nextInt();
    }

    public static int number2(String operation){
        System.out.print("Enter " +operation+ " number 1  ");
        return console.nextInt();
    }
}
