# Задача: Класс "Матрица" (Matrix)

## Описание

Эта задача заключается в создании полноценного класса для работы с матрицами в Java. Класс `Matrix` должен поддерживать базовые операции и обеспечивать корректную обработку ошибок.

## Реализованные Функциональности:

* **Конструктор (`Matrix(int rows, int columns)`):**
    * Инициализация матрицы заданными размерами.
    * Валидация: `rows` и `columns` должны быть положительными числами. Если нет - выбрасывается `IllegalArgumentException`.
* **Метод `setMatrixValues(int[][] newValues)`:**
    * Позволяет заполнить всю матрицу значениями из переданного двумерного массива.
    * Валидация: Проверяет, что `newValues` не `null` и его размеры совпадают с размерами текущей матрицы. В случае несовпадения - `IllegalArgumentException`.
* **Метод `setValue(int row, int col, int value)`:**
    * Устанавливает конкретное значение в ячейку по заданным индексам.
    * Валидация: Проверяет, что индексы `row` и `col` находятся в пределах матрицы. В противном случае - `IllegalArgumentException`.
* **Метод `add(Matrix other)`:**
    * Выполняет сложение текущей матрицы с другой матрицей (`other`).
    * Валидация: Обе матрицы должны быть одного размера. Если нет - `IllegalArgumentException`.
    * Возвращает новую матрицу, содержащую результат сложения.
* **Метод `toString()`:**
    * Переопределен для предоставления удобного текстового представления матрицы (для вывода на консоль).

## Примеры Использования (класс `Main.java`):

Пример использования класса `Matrix` и демонстрация обработки исключений находится в файле `Main.java`.

```java
// Пример из Main.java, который демонстрирует сложение и обработку ошибок

Matrix matrixA = new Matrix(2, 2);
int[][] valuesA = {{1, 2}, {3, 4}};
matrixA.setMatrixValues(valuesA);

Matrix matrixB = new Matrix(2, 2);
int[][] valuesB = {{5, 6}, {7, 8}};
matrixB.setMatrixValues(valuesB);

try {
    Matrix sumAB = matrixA.add(matrixB);
    System.out.println("Result of A + B:\n" + sumAB);
} catch (IllegalArgumentException e) {
    System.out.println("Error during addition: " + e.getMessage());
}

// ... и другие тесты