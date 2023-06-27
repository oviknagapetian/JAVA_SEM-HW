//4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package org.example;

public class HW1T4 {
    public static void main(String[] args) {
        int q, w, e;
        int solutionsCount = 0;

        for (q = 0; q <= 9; q++) {
            for (w = 0; w <= 9; w++) {
                for (e = 0; e <= 9; e++) {
                    if (q + w == e) {
                        System.out.println(q + " + " + w + " = " + e);
                        solutionsCount++;
                    }
                }
            }
        }

        if (solutionsCount == 0) {
            System.out.println("No solution found.");
        }
    }
}
