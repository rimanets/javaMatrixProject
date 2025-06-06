package com.rimanets.javamatrix;

public class Matrix {
    private int[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) { // Конструктор
        if (rows <= 0 || columns <= 0) {
            throw new IllegalArgumentException("Matrix dimension must be positive.");
        }
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public void setMatrixValues(int[][] newValues) {
        if (newValues == null) {
            throw new IllegalArgumentException("Input values array cannot be null.");
        }
        if (newValues.length != this.rows) {
            // Улучшим сообщение для большей информативности, как мы обсуждали
            throw new IllegalArgumentException("Input values array has incorrect number of rows (expected: " + this.rows + ", got: " + newValues.length + ").");
        }
        for (int i = 0; i < this.rows; i++) {
            if (newValues[i] == null || newValues[i].length != this.columns) {
                // Улучшим сообщение
                throw new IllegalArgumentException("Input values array has incorrect number of columns in row " + i + " (expected: " + this.columns + ", got: " + (newValues[i] == null ? "null" : newValues[i].length) + ").");
            }
        }
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.data[i][j] = newValues[i][j];
            }
        }
    } // <-- ВАЖНО: ЗАКРЫВАЮЩАЯ СКОБКА ДЛЯ setMatrixValues НАХОДИТСЯ ЗДЕСЬ!

    public void setValue(int row, int col, int value) {
        if (row < 0 || row >= this.rows) {
            throw new IllegalArgumentException("Row index " + row + " is out of bounds for matrix with " + this.rows + " rows.");
        }
        if (col < 0 || col >= this.columns) {
            throw new IllegalArgumentException("Column index " + col + " is out of bounds for matrix with " + this.columns + " columns.");
        }
        this.data[row][col] = value;
    }

    public Matrix add(Matrix other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot add a null matrix.");
        }
        // ОПЕЧАТКА ИСПРАВЛЕНА: other.pows -> other.rows
        if (this.rows != other.rows || this.columns != other.columns) {
            // Улучшим сообщение, чтобы оно показывало размеры для отладки
            throw new IllegalArgumentException("Matrices dimensions do not match for addition. This matrix is " + this.rows + "x" + this.columns + ", other is " + other.rows + "x" + other.columns + ".");
        }

        Matrix resultMatrix = new Matrix(this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                // ЭТА СТРОКА БЫЛА ЛИШНЕЙ И ЯВЛЯЛАСЬ ПРИЧИНОЙ ОШИБКИ newValues!
                // this.data[i][j] = newValues[i][j];
                resultMatrix.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return resultMatrix;
    }
    /**
     * Возвращает строковое представление матрицы.
     * @return Строковое представление матрицы.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        // Опционально: можно добавить информацию о размерах
        builder.append("Matrix (").append(rows).append("x").append(columns).append("):\n");

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                builder.append(this.data[i][j]); // Добавляем значение элемента
                if (j < this.columns - 1) { // Если это не последний элемент в строке, добавляем пробел
                    builder.append(" ");
                }
            }
            // Добавляем новую строку после каждой строки матрицы
            // Мы не хотим добавлять лишнюю новую строку после последней строки,
            // если только она не нужна для форматирования.
            // Простейший способ: добавлять всегда, а потом, возможно, обрезать лишнюю.
            // Или более аккуратно:
            if (i < this.rows - 1) { // Если это не последняя строка
                builder.append("\n"); // Добавляем символ новой строки
            }
        }
        // Если матрица пустая или нужно избежать лишнего перевода строки в конце,
        // можно убрать его, если он есть, но для вывода обычно это не критично.
        // if (builder.length() > 0 && builder.charAt(builder.length() - 1) == '\n') {
        //     builder.deleteCharAt(builder.length() - 1);
        // }

        return builder.toString(); // Возвращаем окончательную строку
    }
}