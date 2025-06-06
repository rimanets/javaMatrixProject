package com.rimanets.javamatrix;

    public class Main {
        public static void main(String[] args){
            System.out.println("Starting matrix tests...");

            // Исходные двумерные массивы для инициализации
            int[][] valuesA = {{1, 2}, {3, 4}}; // 2x2
            int[][] valuesB = {{5, 6}, {7, 8}}; // 2x2
            int[][] valuesC = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}; // 3x3 (другой размер)
            int[][] valuesD = {{9, 8}}; // 1x2 (еще один другой размер для дополнительного теста)
            // 1. Создание объектов Matrix
            // нужно создать объекты Matrix, используя их конструктор,
            // а затем заполнить их значениями с помощью setMatrixValues.
            // Например:
            // Matrix matrixA = new Matrix(2, 2);
            // matrixA.setMatrixValues(valuesA);
            // ... сделай так для matrixB, matrixC, matrixD

            Matrix matrixA = new Matrix(2,2);
            Matrix matrixB = new Matrix(2,2);
            Matrix matrixC = new Matrix(3,3);
            Matrix matrixD = new Matrix(1,2);
            matrixA.setMatrixValues(valuesA);
            matrixB.setMatrixValues(valuesB);
            matrixC.setMatrixValues(valuesC);
            matrixD.setMatrixValues(valuesD);

            System.out.println("\n--- Testing Matrix Addition ---");

            // 2. Тестирование успешного сложения (матрицы одного размера)
            System.out.println("\nAttempting to add MatrixA and MatrixB:");
            try {
                Matrix sumAB = matrixA.add(matrixB);
                System.out.println("Result of A + B:\n" + sumAB);
            } catch (IllegalArgumentException e) {
                System.out.println("Error during addition of A and B: " + e.getMessage());
            }

            // 3. Тестирование неуспешного сложения (матрицы разных размеров)
            System.out.println("\nAttempting to add MatrixA and MatrixC:");
            try {
                Matrix sumAC = matrixA.add(matrixC); // Ожидаем исключение здесь
                System.out.println("Result of A + C:\n" + sumAC); // Эта строка не должна быть выполнена
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Matrices cannot be added!");
                System.out.println("Reason: " + e.getMessage()); // Выводим сообщение из исключения
            }

            System.out.println("\n--- All tests completed ---");
        }
    }

