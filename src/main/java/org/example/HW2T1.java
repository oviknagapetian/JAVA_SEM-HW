import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class HW2T1 {
    public static void main(String[] args) {
        // Задача 1: Формирование части WHERE запроса SQL

        JSONObject filters = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        StringBuilder whereClause = new StringBuilder();

        for (String key : filters.keySet()) {
            String value = filters.getString(key);

            if (!value.equals("null")) {
                if (whereClause.length() > 0) {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append("=").append(value);
            }
        }

        System.out.println("WHERE clause: " + whereClause.toString());

        // Задача 2: Реализация сортировки пузырьком с записью в лог-файл

        int[] array = {5, 2, 8, 1, 9};
        bubbleSort(array, "log.txt");

        // Вывод отсортированного массива
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] array, String logFileName) {
        try {
            FileWriter writer = new FileWriter(logFileName);

            int n = array.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;

                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                        swapped = true;
                    }
                }

                // Запись текущего состояния массива в лог-файл
                writer.write("Iteration " + (i + 1) + ": ");
                for (int num : array) {
                    writer.write(num + " ");
                }
                writer.write("\n");

                // Если не было перестановок на данной итерации, то массив уже отсортирован
                if (!swapped) {
                    break;
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
