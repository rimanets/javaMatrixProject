package maxOopArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        IntArrayProcessor processor = new IntArrayProcessor();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        processor.inputArray();
        processor.printArray();

        int max = processor.findMax();
        System.out.println("Максимальное значение: " + max);

        System.out.println("Выберите сортировку:");
        System.out.println("1 - по возрастанию");
        System.out.println("2 - по убыванию");
        String choice = br.readLine();

        if (choice.equals("1")) {
            processor.sortAscending();
        } else if (choice.equals("2")) {
            processor.sortDescending();
        } else {
            System.out.println("Неверный выбор");
        }
    }
}
