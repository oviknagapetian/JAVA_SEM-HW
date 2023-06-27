//3) Реализовать простой калькулятор

package org.example;

import java.util.Scanner;

public class HW1T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);

        scanner.close();
    }

    private static double calculate(double num1, double num2, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return 0;
        }

        return result;
    }
}
