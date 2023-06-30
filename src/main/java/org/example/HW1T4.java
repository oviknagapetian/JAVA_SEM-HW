//4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package org.example;

public class HW1T4 {
    public static void main(String[] args) {
        boolean solutionFound = false;

        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    if (isValidEquation(q, w, e)) {
                        System.out.println(q + " + " + w + " = " + e);
                        solutionFound = true;
                    }
                }
            }
        }

        if (!solutionFound) {
            System.out.println("No solution found.");
        }
    }

    private static boolean isValidEquation(int q, int w, int e) {
        if (q + w == e) {
            return true;
        }

        // Проверяем, являются ли знаки вопроса допустимыми заменами
        if (q == -1 || w == -1 || e == -1) {
            return true;
        }

        return false;
    }
}
