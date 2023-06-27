package org.example;

public class HW1T1 {
    public static void main(String[] args) {
        int n = 5; // Задайте значение n

        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("Triangular Number of " + n + ": " + triangularNumber);

        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + ": " + factorial);
    }

    private static int calculateTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    private static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
