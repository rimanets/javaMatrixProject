package myapp;

public class Person {
    String species = "Homo sapiens"; // это общее для всех
    String name; // это будем задавать в конструкторе

    // Конструктор:
    public Person(String name) {
        this.name = name;
    }

    // Метод для вывода:
    public void print() {
        System.out.println("Name: " + name + ", Species: " + species);
    }
}
