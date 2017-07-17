package com.theironyard.installparty;

import java.util.*;


public class Main {

    public static void main(String[] arguments) {

        System.out.print("Please enter a number.");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        double operand1 = Double.parseDouble(input1);



        System.out.print("Please enter another number");
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.next();
        double operand2 = Double.parseDouble(input2);

    double sum = operand1 + operand2;
    double subtraction = operand1 - operand2;
    double multiplication = operand1 * operand2;
    double division = operand1 / operand2;
    double remainder = operand1 % operand2;

    showResults(sum, subtraction, multiplication, division, remainder);
    }

    public static void showResults(double sum, double subtraction, double multiplication, double division, double remainder){
//        System.out.println();
        System.out.print("The sum is "+ sum +".");
        System.out.println("The difference is " + subtraction +".");
        System.out.println("The product is " + multiplication +".");
        System.out.println("The quotient is " + division +".");
        System.out.println("The remainder is " + remainder +".");
    }

}
