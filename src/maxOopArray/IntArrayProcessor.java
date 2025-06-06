package maxOopArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class IntArrayProcessor {
    private int[] array; //произошла инкапсуялиция, приватный массив - досутп через методы

    public void inputArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива: ");
        int size = Integer.parseInt(br.readLine());
        array = new int[size];
        System.out.println("Введите " + size + " значений массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
    }

    public void printArray() {
        System.out.println("Массив:");
        for (int value : array) {
            System.out.println(value);
        }
    }

    public int findMax() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public void sortAscending() {
        Arrays.sort(array);
        System.out.println("Массив по возрастанию:");
        printArray();
    }

    public void sortDescending() {
        // Преобразуем int[] в Integer[] для сортировки по убыванию
        Integer[] temp = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, Collections.reverseOrder());

        // Возвращаем обратно в int[]
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }

        System.out.println("Массив по убыванию:");
        printArray();
    }
}
