package maxArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] inputArray() throws IOException {   //функция ввода массива
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива: ");
        int size = Integer.parseInt(br.readLine());
        int array[] = new int[size];
        System.out.println("Введите " + size + " значений массива: ");
        for (int i = 0; i < size; i++) {
            int digit = Integer.parseInt(br.readLine());
            array[i] = digit;
        }
        return array;
    }

    public static void printArray(int[] array) {    //функция вывода массива
        for (int digit : array) {
            System.out.println("Элемент массива: " + digit);
        }
    }

    public static int findMax(int[] array) {    //функция нахождения максимального
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) throws IOException {
        int[] userArray = inputArray();
        printArray(userArray);
        int max = findMax(userArray);
        System.out.println("Максимальное значение: " + max);
    }
}